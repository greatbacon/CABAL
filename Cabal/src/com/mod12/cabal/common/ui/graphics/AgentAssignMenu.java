/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mod12.cabal.common.ui.graphics;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import com.mod12.cabal.common.Cabal;
import com.mod12.cabal.common.dto.FactionDTO;
import com.mod12.cabal.common.dto.MissionConceptDTO;
import com.mod12.cabal.common.dto.StageDTO;
import com.mod12.cabal.common.util.Graphics;

/**
 * @author Hamilton
 */
public class AgentAssignMenu extends javax.swing.JFrame {

    /**
     * Creates new form AgentAssignMenu
     */

    private Cabal cabal;
    private GameMenu gameMenu;
    private DefaultListModel lineModel;
    private MissionMenu missionMenu;
    private MissionConceptDTO missionConcept;
    private StageDTO inStage;

    public AgentAssignMenu(Cabal cabal, GameMenu gameMenu, MissionMenu menu, 
    		MissionConceptDTO missionConcept, StageDTO stage) {
        this.cabal = cabal;
        this.gameMenu = gameMenu;
        this.missionMenu = menu;
        this.missionConcept = missionConcept;
        this.inStage = stage;
        lineModel = new DefaultListModel();
        initComponents();
        labelProbability.setVisible(false);
        labelProbVal.setVisible(false);
        populateList();
        Graphics.centreWindow(this);
        enableScreen(gameMenu.myTurn());
    }

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAgents = new javax.swing.JList();
        labelProbability = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonExecute = new javax.swing.JButton();
        labelProbVal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listAgents.setModel(lineModel);
        listAgents.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAgentsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listAgents);

        labelProbability.setText("Probability of Success :");

        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonExecute.setText("Execute");
        buttonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecuteActionPerformed(evt);
            }
        });

        labelProbVal.setText("##");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(labelProbability)
                        .addGap(18, 18, 18)
                        .addComponent(labelProbVal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(buttonExecute))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonBack)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProbability)
                    .addComponent(buttonExecute)
                    .addComponent(labelProbVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listAgentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listAgentsValueChanged
        calculateProbability();
    }//GEN-LAST:event_listAgentsValueChanged

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        missionMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecuteActionPerformed
        try {
			startMission();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_buttonExecuteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonExecute;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelProbVal;
    private javax.swing.JLabel labelProbability;
    private javax.swing.JList listAgents;
    // End of variables declaration//GEN-END:variables

    private void populateList() {
    	lineModel.clear();
    	FactionDTO faction;    	
    	faction = cabal.getMyFaction();
    	for (String agent : faction.getNonBusyAgents()) {
    		lineModel.add(lineModel.getSize(), agent);
    	}
    }
	
	private void startMission() throws InterruptedException {
		String agent = (String) listAgents.getSelectedValue();
		String faction = cabal.getCurrentStepFaction().getName();
		if (missionConcept.requiresTarget()) {
			String target = null;
			List<String> allFactions = cabal.getFactionsAtStage(inStage.getName());
			allFactions.remove(cabal.getCurrentStepFaction().getName());
			Object[] targetFactions = allFactions.toArray();
			
			if (targetFactions.length != 0) {
				while (target == null) {
					target = (String) JOptionPane.showInputDialog(this, Message.CHOOSE_TARGET_FACTION, Message.TARGET,
							JOptionPane.QUESTION_MESSAGE, null, targetFactions, targetFactions[0]);
				}
			}
			
			cabal.createMissionInstance(faction, missionConcept, inStage.getName(), agent, target);
		} else {
			cabal.createMissionInstance(faction, missionConcept, inStage.getName(), agent);
		}
		
		System.out.println("mission started! " + missionConcept.getName() + " requires target " + 
				missionConcept.requiresTarget());
		
		gameMenu.setVisible(true);
		this.dispose();
	}

    private void calculateProbability() {
        String agent = (String) listAgents.getSelectedValue();
        int probability = cabal.calculateAgentProbability(cabal.getCurrentStepFaction().getName(), 
        		agent, missionConcept);
        labelProbability.setVisible(true);
        labelProbVal.setText("%" + probability);
        labelProbVal.setVisible(true);
    }
    
    private void enableScreen(boolean myTurn) {
    	buttonExecute.setEnabled(myTurn);
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mod12.cabal.common.ui.graphics;

import java.util.List;

import javax.swing.DefaultListModel;

import com.mod12.cabal.common.Cabal;
import com.mod12.cabal.common.dto.MissionConceptDTO;
import com.mod12.cabal.common.dto.StageDTO;
import com.mod12.cabal.common.util.Graphics;

/**
 * @author Hamilton
 */
public class MissionMenu extends javax.swing.JFrame {

	private Cabal cabal;
	private GameMenu gameMenu;
	private LocationMenu locationMenu;
	private DefaultListModel lineModel;
	private List<MissionConceptDTO> possibleMissions;
	private StageDTO inStage;

    public MissionMenu(Cabal cabal, GameMenu gameMenu, LocationMenu locationMenu, StageDTO inStage) {
        this.cabal = cabal;
        this.gameMenu = gameMenu;
        this.locationMenu = locationMenu;
        this.inStage = inStage;
    	lineModel = new DefaultListModel();
        initComponents();
        displayMissions();
        Graphics.centreWindow(this);
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
        listMissions = new javax.swing.JList();
        labelAvailableMissions = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        labelDescription = new javax.swing.JLabel();
        buttonAssignAgent = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(1, 1, 1)));

        listMissions.setModel(lineModel);
        listMissions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMissionsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listMissions);

        labelAvailableMissions.setText("Available Missions");

        textAreaDescription.setColumns(20);
        textAreaDescription.setRows(5);
        jScrollPane2.setViewportView(textAreaDescription);

        labelDescription.setText("Description");

        buttonAssignAgent.setText("Assign Agent");
        buttonAssignAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAssignAgentActionPerformed(evt);
            }
        });

        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAssignAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(labelAvailableMissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(labelDescription)
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAvailableMissions)
                    .addComponent(labelDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(buttonAssignAgent)
                        .addGap(53, 53, 53)
                        .addComponent(buttonBack)))
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

    private void listMissionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMissionsValueChanged
        displayMissionDescription((String) listMissions.getSelectedValue());
    }//GEN-LAST:event_listMissionsValueChanged

    private void buttonAssignAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAssignAgentActionPerformed
        assignAgent((String) listMissions.getSelectedValue());
    }//GEN-LAST:event_buttonAssignAgentActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        locationMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAssignAgent;
    private javax.swing.JButton buttonBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAvailableMissions;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JList listMissions;
    private javax.swing.JTextArea textAreaDescription;
    // End of variables declaration//GEN-END:variables


    private void displayMissions() {
    	lineModel.clear();
    	List<String> missions = inStage.getPossibleMissions();
    	possibleMissions = cabal.getMissions(missions);
    	for (String mission : missions) {
    		lineModel.addElement(mission);
    	}
    }

    private void displayMissionDescription(String missionName) {
		textAreaDescription.setText(findMissionConcept(missionName).getInfo());
    }

    private void assignAgent(String missionName) {
    	AgentAssignMenu menu = new AgentAssignMenu(cabal, gameMenu, this, findMissionConcept(missionName), inStage);
    	this.setVisible(false);
    	menu.setVisible(true);
    }

    private MissionConceptDTO findMissionConcept(String name) {
    	for (MissionConceptDTO mission : possibleMissions) {
    		if (mission.getName().equals(name)) {
    			return mission;
    		}
    	}
    	
		return null;
    }

}

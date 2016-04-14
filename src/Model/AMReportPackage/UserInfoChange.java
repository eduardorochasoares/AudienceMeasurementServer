/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.util.ArrayList;

/**
 *
 * @author Principal
 */
public class UserInfoChange extends UserID {

    private ArrayList<GenericUserInfo> genericUserInfo = new ArrayList<>();
    private ArrayList<ControlledUserInfoString> controlledUserInfoString = new ArrayList<>();
    private ArrayList<ControlledUserInfoDate> controlledUserInfoDate = new ArrayList<>();
    private ArrayList<ControlledUserInfoAddress> controlledUserInfoAddress = new ArrayList<>();

}

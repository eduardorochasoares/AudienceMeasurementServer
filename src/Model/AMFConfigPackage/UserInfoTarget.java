/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

/**
 *
 * @author Principal
 */
public class UserInfoTarget {
    private String userInfoTypeString;
    private boolean ignoreIfUnavailable = false;
    private String userInfoValueString ;

    /**
     * @return the userInfoTypeString
     */
    public String getUserInfoTypeString() {
        return userInfoTypeString;
    }

    /**
     * @param userInfoTypeString the userInfoTypeString to set
     */
    public void setUserInfoTypeString(String userInfoTypeString) {
        this.userInfoTypeString = userInfoTypeString;
    }

    /**
     * @return the ignoreIfUnavailable
     */
    public boolean isIgnoreIfUnavailable() {
        return ignoreIfUnavailable;
    }

    /**
     * @param ignoreIfUnavailable the ignoreIfUnavailable to set
     */
    public void setIgnoreIfUnavailable(boolean ignoreIfUnavailable) {
        this.ignoreIfUnavailable = ignoreIfUnavailable;
    }

    /**
     * @return the userInfoValueString
     */
    public String getUserInfoValueString() {
        return userInfoValueString;
    }

    /**
     * @param userInfoValueString the userInfoValueString to set
     */
    public void setUserInfoValueString(String userInfoValueString) {
        this.userInfoValueString = userInfoValueString;
    }
}

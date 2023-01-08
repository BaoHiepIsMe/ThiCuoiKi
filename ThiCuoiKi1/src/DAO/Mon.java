/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author hiep1
 */
public class Mon {
    private String tenmon;
    private String giamon;

    public Mon() {
    }

    public Mon(String tenmon, String giamon) {
        this.tenmon = tenmon;
        this.giamon = giamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGiamon() {
        return giamon;
    }

    public void setGiamon(String giamon) {
        this.giamon = giamon;
    }

    @Override
    public String toString() {
        return "Mon{" + "tenmon=" + tenmon + ", giamon=" + giamon + '}';
    }
    
    
}

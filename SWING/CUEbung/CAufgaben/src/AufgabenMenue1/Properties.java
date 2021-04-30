/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AufgabenMenue1;

/**
 *
 * @author jgruenauer17
 */
public class Properties {
    private boolean magich;
    private boolean isstzuviel;
    private boolean trinktzuviel;
    private boolean huebsch;
    private boolean zudick;

    public Properties(boolean magich, boolean isstzuviel, boolean trinktzuviel, boolean huebsch, boolean zudick) {
        this.magich = magich;
        this.isstzuviel = isstzuviel;
        this.trinktzuviel = trinktzuviel;
        this.huebsch = huebsch;
        this.zudick = zudick;
    }

    public boolean isMagich() {
        return magich;
    }

    public void setMagich(boolean magich) {
        this.magich = magich;
    }

    public boolean isIsstzuviel() {
        return isstzuviel;
    }

    public void setIsstzuviel(boolean isstzuviel) {
        this.isstzuviel = isstzuviel;
    }

    public boolean isTrinktzuviel() {
        return trinktzuviel;
    }

    public void setTrinktzuviel(boolean trinktzuviel) {
        this.trinktzuviel = trinktzuviel;
    }

    public boolean isHuebsch() {
        return huebsch;
    }

    public void setHuebsch(boolean huebsch) {
        this.huebsch = huebsch;
    }

    public boolean isZudick() {
        return zudick;
    }

    public void setZudick(boolean zudick) {
        this.zudick = zudick;
    }

    @Override
    public String toString() {
        return magich + "," + isstzuviel + "," + trinktzuviel + "," + huebsch + "," + zudick;
    }
    
    
    
    
}

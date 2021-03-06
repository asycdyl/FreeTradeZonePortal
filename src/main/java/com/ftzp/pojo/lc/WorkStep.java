package com.ftzp.pojo.lc;

import java.util.ArrayList;
import java.util.List;

public class WorkStep {
    public static List<WorkStep> wss = new ArrayList<>();

    Integer wsId;   //WorkStep的唯一ID
    String wsName;  //WorkStep的名字
    Integer rId;    //所需要的Role的权限ID
    Integer wId;   // 对应的Work的ID
    Integer wfId;   // 对应的Work的ID
    Integer ranking;    //对应的执行次序
    String wsdesc;    //对应的执行次序

    //数据库没有此字段，传给前端用的
    String wFile;

    public String getwFile() {
        return wFile;
    }

    public void setwFile(String wFile) {
        this.wFile = wFile;
    }

    public String getWsdesc() {
        return wsdesc;
    }

    public void setWsdesc(String wsdesc) {
        this.wsdesc = wsdesc;
    }

    public static List<WorkStep> getWss() {
        return wss;
    }

    public static void setWss(List<WorkStep> wss) {
        WorkStep.wss = wss;
    }

    public Integer getWfId() {
        return wfId;
    }

    public void setWfId(Integer wfId) {
        this.wfId = wfId;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public int getWsId() {
        return wsId;
    }

    public void setWsId(Integer wsId) {
        this.wsId = wsId;
    }


    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

}

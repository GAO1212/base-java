package service;

import domain.*;

public class teamservice {
    private static int counter=1;
    private final int maxmember=5;
    private programmer[] team=new programmer[maxmember];
    private int total;

    public programmer[] getTeam() {
        programmer[] p=new programmer[total];
        for (int i = 0; i < total; i++) {
            p[i]=team[i];
        }
        return p;
    }
    public void addmember(employee e)throws teamexception{
        if (total>=maxmember){throw new teamexception("成员已满，无法添加");}
        if (!(e instanceof programmer)){throw new teamexception("不是开发人员，无法添加");}
        programmer p=(programmer) e;
        status status=p.getStatus();
        switch (status){
            case BUSY -> throw new teamexception("该成员已是开发团队成员");
            case VOCATION -> throw new teamexception("员工正在休假");
        }
        int arcnum=0,desnum=0,pronum=0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof architect){arcnum++;}
            else if (team[i] instanceof designer) {desnum++;}
            else if (team[i] instanceof programmer) {pronum++;}
            }
if (p instanceof architect){
 if (arcnum>=1){throw new teamexception("已经有一名架构师了");}
} else if (p instanceof designer) {if (desnum>=2){throw new teamexception("已经有二名设计师了");}
else {if (pronum>=3){throw new teamexception("已经有三名程序员了");}
}
    }
team[total++]=p;
p.setMemember(counter++);
p.setStatus(domain.status.BUSY);
        }

    public void removemember(int memberid)throws teamexception{
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemember()==memberid){
                team[i].setStatus(status.FREE);
                break;
            }
            if (i==total){throw new teamexception("没找到此id的人员，删除失败");}
        }
        for (int j =i+1; j < total; j++) {
            team[j-1]=team[j];
        }
        team[--total]=null;
    }
}

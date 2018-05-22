package cn.jethro.pmsmanage.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sitinfor")
public class SitInfor implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stationid;
    //车位类型
    private int stationtype;

    public int getStationid() {
        return stationid;
    }

    public void setStationid(int stationid) {
        this.stationid = stationid;
    }

    public int getStationtype() {
        return stationtype;
    }

    public void setStationtype(int stationtype) {
        this.stationtype = stationtype;
    }
}
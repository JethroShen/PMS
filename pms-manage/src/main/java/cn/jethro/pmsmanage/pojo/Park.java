package cn.jethro.pmsmanage.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "park")
public class Park implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //车牌号
    private String carId;
    //车位id
    private int stationid;
    //入库时间
    private Date startpark;
    //出库时间
    private Date endpark;
    //消费
    private int fee;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getStationid() {
        return stationid;
    }

    public void setStationid(int stationid) {
        this.stationid = stationid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}

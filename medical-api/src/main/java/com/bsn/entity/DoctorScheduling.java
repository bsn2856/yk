package com.bsn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@TableName("t_doctor_scheduling")
public class DoctorScheduling implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("doctor_name")
    private String doctorName;

    @TableField("type_id")
    private Integer typeId;

    @TableField("total")
    private Integer total;

    @TableField("num")
    private Integer num;

    @TableField("appointment_datatime")
    private Date appointmentDatatime;

    @TableField("expertise_area")
    private String expertiseArea;

    @TableField(exist = false)
    private String gradeName;

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public Date getAppointmentDatatime() {
        return appointmentDatatime;
    }

    public void setAppointmentDatatime(Date appointmentDatatime) {
        this.appointmentDatatime = appointmentDatatime;
    }
    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    @Override
    public String toString() {
        return "DoctorScheduling{" +
            "id=" + id +
            ", doctorName=" + doctorName +
            ", typeId=" + typeId +
            ", total=" + total +
            ", num=" + num +
            ", appointmentDatatime=" + appointmentDatatime +
            ", expertiseArea=" + expertiseArea +
        "}";
    }
}

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
@TableName("t_order_appointment")
public class OrderAppointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("appointment_name")
    private String appointmentName;

    @TableField("mobile")
    private String mobile;

    @TableField("id_card_no")
    private String idCardNo;

    @TableField("appointment_date")
    private Date appointmentDate;

    @TableField("create_datetime")
    private Date createDatetime;

    @TableField("doctor_scheduling_id")
    private Integer doctorSchedulingId;

    @TableField("doctor_name")
    private String doctorName;
    @TableField(exist = false)
    private Integer did;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getAppointmentName() {
        return appointmentName;
    }

    public void setAppointmentName(String appointmentName) {
        this.appointmentName = appointmentName;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
    public Integer getDoctorSchedulingId() {
        return doctorSchedulingId;
    }

    public void setDoctorSchedulingId(Integer doctorSchedulingId) {
        this.doctorSchedulingId = doctorSchedulingId;
    }
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "OrderAppointment{" +
            "id=" + id +
            ", appointmentName=" + appointmentName +
            ", mobile=" + mobile +
            ", idCardNo=" + idCardNo +
            ", appointmentDate=" + appointmentDate +
            ", createDatetime=" + createDatetime +
            ", doctorSchedulingId=" + doctorSchedulingId +
            ", doctorName=" + doctorName +
        "}";
    }
}

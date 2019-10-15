package com.liu.jersey;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/5/12 9:11
 */


@XmlRootElement
@Data
public class User {
    private String name;
    private String password;
    private int id;


}
//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>年级类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="年级类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="大一"/>
 *     &lt;enumeration value="大二"/>
 *     &lt;enumeration value="大三"/>
 *     &lt;enumeration value="大四"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5e74\u7ea7\u7c7b\u578b")
@XmlEnum
public enum 年级类型 {

    大一,
    大二,
    大三,
    大四;

    public String value() {
        return name();
    }

    public static 年级类型 fromValue(String v) {
        return valueOf(v);
    }

}

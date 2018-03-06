//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>CourseScore complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourseScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="成绩" type="{http://jw.nju.edu.cn/schema}成绩类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="成绩性质" type="{http://jw.nju.edu.cn/schema}成绩性质类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "课程成绩类型", namespace = cn.edu.nju.soa.model.Namespace.JW_URI, propOrder = {
    "score"
})
public class CourseScore {

    @XmlElement(name = "成绩")
    protected List<cn.edu.nju.soa.model.ScoreType> score;
    @XmlAttribute(name="课程编号")
    protected String courseId;
    @XmlAttribute(name="成绩性质")
    protected cn.edu.nju.soa.model.ScoreAttributeType scoreType;

    /**
     * Gets the value of the 成绩 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 成绩 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get成绩().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link cn.edu.nju.soa.model.ScoreType }
     * 
     * 
     */
    public List<cn.edu.nju.soa.model.ScoreType> getScore() {
        if (this.score == null) {
            this.score = new ArrayList<cn.edu.nju.soa.model.ScoreType>();
        }
        return this.score;
    }

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return this.courseId;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
    }

    /**
     * 获取成绩性质属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.soa.model.ScoreAttributeType }
     *     
     */
    public cn.edu.nju.soa.model.ScoreAttributeType getScoreType() {
        return this.scoreType;
    }

    /**
     * 设置成绩性质属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.soa.model.ScoreAttributeType }
     *     
     */
    public void setScoreType(cn.edu.nju.soa.model.ScoreAttributeType value) {
        this.scoreType = value;
    }

}

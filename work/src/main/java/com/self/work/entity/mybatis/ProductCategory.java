package com.self.work.entity.mybatis;

import java.util.Date;

public class ProductCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category_id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category_name
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.category_type
     *
     * @mbggenerated
     */
    private Integer categoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category_id
     *
     * @return the value of product_category.category_id
     *
     * @mbggenerated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category_id
     *
     * @param categoryId the value for product_category.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category_name
     *
     * @return the value of product_category.category_name
     *
     * @mbggenerated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category_name
     *
     * @param categoryName the value for product_category.category_name
     *
     * @mbggenerated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.category_type
     *
     * @return the value of product_category.category_type
     *
     * @mbggenerated
     */
    public Integer getCategoryType() {
        return categoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.category_type
     *
     * @param categoryType the value for product_category.category_type
     *
     * @mbggenerated
     */
    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.create_time
     *
     * @return the value of product_category.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.create_time
     *
     * @param createTime the value for product_category.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.update_time
     *
     * @return the value of product_category.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.update_time
     *
     * @param updateTime the value for product_category.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
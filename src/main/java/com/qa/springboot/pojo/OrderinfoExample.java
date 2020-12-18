package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOfidIsNull() {
            addCriterion("ofid is null");
            return (Criteria) this;
        }

        public Criteria andOfidIsNotNull() {
            addCriterion("ofid is not null");
            return (Criteria) this;
        }

        public Criteria andOfidEqualTo(String value) {
            addCriterion("ofid =", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotEqualTo(String value) {
            addCriterion("ofid <>", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThan(String value) {
            addCriterion("ofid >", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThanOrEqualTo(String value) {
            addCriterion("ofid >=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThan(String value) {
            addCriterion("ofid <", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThanOrEqualTo(String value) {
            addCriterion("ofid <=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLike(String value) {
            addCriterion("ofid like", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotLike(String value) {
            addCriterion("ofid not like", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidIn(List<String> values) {
            addCriterion("ofid in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotIn(List<String> values) {
            addCriterion("ofid not in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidBetween(String value1, String value2) {
            addCriterion("ofid between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotBetween(String value1, String value2) {
            addCriterion("ofid not between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOfdateIsNull() {
            addCriterion("ofdate is null");
            return (Criteria) this;
        }

        public Criteria andOfdateIsNotNull() {
            addCriterion("ofdate is not null");
            return (Criteria) this;
        }

        public Criteria andOfdateEqualTo(Date value) {
            addCriterionForJDBCDate("ofdate =", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ofdate <>", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ofdate >", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ofdate >=", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateLessThan(Date value) {
            addCriterionForJDBCDate("ofdate <", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ofdate <=", value, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateIn(List<Date> values) {
            addCriterionForJDBCDate("ofdate in", values, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ofdate not in", values, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ofdate between", value1, value2, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ofdate not between", value1, value2, "ofdate");
            return (Criteria) this;
        }

        public Criteria andOfstateIsNull() {
            addCriterion("ofstate is null");
            return (Criteria) this;
        }

        public Criteria andOfstateIsNotNull() {
            addCriterion("ofstate is not null");
            return (Criteria) this;
        }

        public Criteria andOfstateEqualTo(Integer value) {
            addCriterion("ofstate =", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateNotEqualTo(Integer value) {
            addCriterion("ofstate <>", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateGreaterThan(Integer value) {
            addCriterion("ofstate >", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofstate >=", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateLessThan(Integer value) {
            addCriterion("ofstate <", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateLessThanOrEqualTo(Integer value) {
            addCriterion("ofstate <=", value, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateIn(List<Integer> values) {
            addCriterion("ofstate in", values, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateNotIn(List<Integer> values) {
            addCriterion("ofstate not in", values, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateBetween(Integer value1, Integer value2) {
            addCriterion("ofstate between", value1, value2, "ofstate");
            return (Criteria) this;
        }

        public Criteria andOfstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ofstate not between", value1, value2, "ofstate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("contactnumber is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("contactnumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("contactnumber =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("contactnumber <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("contactnumber >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactnumber >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("contactnumber <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("contactnumber <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("contactnumber like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("contactnumber not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("contactnumber in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("contactnumber not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("contactnumber between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("contactnumber not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
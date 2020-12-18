package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodssizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodssizeExample() {
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

        public Criteria andGsidIsNull() {
            addCriterion("gsid is null");
            return (Criteria) this;
        }

        public Criteria andGsidIsNotNull() {
            addCriterion("gsid is not null");
            return (Criteria) this;
        }

        public Criteria andGsidEqualTo(Integer value) {
            addCriterion("gsid =", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotEqualTo(Integer value) {
            addCriterion("gsid <>", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThan(Integer value) {
            addCriterion("gsid >", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsid >=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThan(Integer value) {
            addCriterion("gsid <", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThanOrEqualTo(Integer value) {
            addCriterion("gsid <=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidIn(List<Integer> values) {
            addCriterion("gsid in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotIn(List<Integer> values) {
            addCriterion("gsid not in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidBetween(Integer value1, Integer value2) {
            addCriterion("gsid between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotBetween(Integer value1, Integer value2) {
            addCriterion("gsid not between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGstextIsNull() {
            addCriterion("gstext is null");
            return (Criteria) this;
        }

        public Criteria andGstextIsNotNull() {
            addCriterion("gstext is not null");
            return (Criteria) this;
        }

        public Criteria andGstextEqualTo(String value) {
            addCriterion("gstext =", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextNotEqualTo(String value) {
            addCriterion("gstext <>", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextGreaterThan(String value) {
            addCriterion("gstext >", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextGreaterThanOrEqualTo(String value) {
            addCriterion("gstext >=", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextLessThan(String value) {
            addCriterion("gstext <", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextLessThanOrEqualTo(String value) {
            addCriterion("gstext <=", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextLike(String value) {
            addCriterion("gstext like", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextNotLike(String value) {
            addCriterion("gstext not like", value, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextIn(List<String> values) {
            addCriterion("gstext in", values, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextNotIn(List<String> values) {
            addCriterion("gstext not in", values, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextBetween(String value1, String value2) {
            addCriterion("gstext between", value1, value2, "gstext");
            return (Criteria) this;
        }

        public Criteria andGstextNotBetween(String value1, String value2) {
            addCriterion("gstext not between", value1, value2, "gstext");
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
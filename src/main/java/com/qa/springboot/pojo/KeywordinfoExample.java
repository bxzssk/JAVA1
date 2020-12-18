package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class KeywordinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeywordinfoExample() {
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

        public Criteria andKwidIsNull() {
            addCriterion("kwid is null");
            return (Criteria) this;
        }

        public Criteria andKwidIsNotNull() {
            addCriterion("kwid is not null");
            return (Criteria) this;
        }

        public Criteria andKwidEqualTo(Integer value) {
            addCriterion("kwid =", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidNotEqualTo(Integer value) {
            addCriterion("kwid <>", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidGreaterThan(Integer value) {
            addCriterion("kwid >", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kwid >=", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidLessThan(Integer value) {
            addCriterion("kwid <", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidLessThanOrEqualTo(Integer value) {
            addCriterion("kwid <=", value, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidIn(List<Integer> values) {
            addCriterion("kwid in", values, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidNotIn(List<Integer> values) {
            addCriterion("kwid not in", values, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidBetween(Integer value1, Integer value2) {
            addCriterion("kwid between", value1, value2, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwidNotBetween(Integer value1, Integer value2) {
            addCriterion("kwid not between", value1, value2, "kwid");
            return (Criteria) this;
        }

        public Criteria andKwtextIsNull() {
            addCriterion("kwtext is null");
            return (Criteria) this;
        }

        public Criteria andKwtextIsNotNull() {
            addCriterion("kwtext is not null");
            return (Criteria) this;
        }

        public Criteria andKwtextEqualTo(String value) {
            addCriterion("kwtext =", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextNotEqualTo(String value) {
            addCriterion("kwtext <>", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextGreaterThan(String value) {
            addCriterion("kwtext >", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextGreaterThanOrEqualTo(String value) {
            addCriterion("kwtext >=", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextLessThan(String value) {
            addCriterion("kwtext <", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextLessThanOrEqualTo(String value) {
            addCriterion("kwtext <=", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextLike(String value) {
            addCriterion("kwtext like", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextNotLike(String value) {
            addCriterion("kwtext not like", value, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextIn(List<String> values) {
            addCriterion("kwtext in", values, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextNotIn(List<String> values) {
            addCriterion("kwtext not in", values, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextBetween(String value1, String value2) {
            addCriterion("kwtext between", value1, value2, "kwtext");
            return (Criteria) this;
        }

        public Criteria andKwtextNotBetween(String value1, String value2) {
            addCriterion("kwtext not between", value1, value2, "kwtext");
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
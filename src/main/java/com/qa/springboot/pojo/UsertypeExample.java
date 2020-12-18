package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsertypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertypeExample() {
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

        public Criteria andUtidIsNull() {
            addCriterion("utid is null");
            return (Criteria) this;
        }

        public Criteria andUtidIsNotNull() {
            addCriterion("utid is not null");
            return (Criteria) this;
        }

        public Criteria andUtidEqualTo(Integer value) {
            addCriterion("utid =", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotEqualTo(Integer value) {
            addCriterion("utid <>", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidGreaterThan(Integer value) {
            addCriterion("utid >", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("utid >=", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidLessThan(Integer value) {
            addCriterion("utid <", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidLessThanOrEqualTo(Integer value) {
            addCriterion("utid <=", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidIn(List<Integer> values) {
            addCriterion("utid in", values, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotIn(List<Integer> values) {
            addCriterion("utid not in", values, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidBetween(Integer value1, Integer value2) {
            addCriterion("utid between", value1, value2, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotBetween(Integer value1, Integer value2) {
            addCriterion("utid not between", value1, value2, "utid");
            return (Criteria) this;
        }

        public Criteria andUtnameIsNull() {
            addCriterion("utname is null");
            return (Criteria) this;
        }

        public Criteria andUtnameIsNotNull() {
            addCriterion("utname is not null");
            return (Criteria) this;
        }

        public Criteria andUtnameEqualTo(String value) {
            addCriterion("utname =", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotEqualTo(String value) {
            addCriterion("utname <>", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameGreaterThan(String value) {
            addCriterion("utname >", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameGreaterThanOrEqualTo(String value) {
            addCriterion("utname >=", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLessThan(String value) {
            addCriterion("utname <", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLessThanOrEqualTo(String value) {
            addCriterion("utname <=", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameLike(String value) {
            addCriterion("utname like", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotLike(String value) {
            addCriterion("utname not like", value, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameIn(List<String> values) {
            addCriterion("utname in", values, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotIn(List<String> values) {
            addCriterion("utname not in", values, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameBetween(String value1, String value2) {
            addCriterion("utname between", value1, value2, "utname");
            return (Criteria) this;
        }

        public Criteria andUtnameNotBetween(String value1, String value2) {
            addCriterion("utname not between", value1, value2, "utname");
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
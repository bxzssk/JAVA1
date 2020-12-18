package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsimageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsimageExample() {
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

        public Criteria andGimgidIsNull() {
            addCriterion("gimgid is null");
            return (Criteria) this;
        }

        public Criteria andGimgidIsNotNull() {
            addCriterion("gimgid is not null");
            return (Criteria) this;
        }

        public Criteria andGimgidEqualTo(Integer value) {
            addCriterion("gimgid =", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidNotEqualTo(Integer value) {
            addCriterion("gimgid <>", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidGreaterThan(Integer value) {
            addCriterion("gimgid >", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gimgid >=", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidLessThan(Integer value) {
            addCriterion("gimgid <", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidLessThanOrEqualTo(Integer value) {
            addCriterion("gimgid <=", value, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidIn(List<Integer> values) {
            addCriterion("gimgid in", values, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidNotIn(List<Integer> values) {
            addCriterion("gimgid not in", values, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidBetween(Integer value1, Integer value2) {
            addCriterion("gimgid between", value1, value2, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgidNotBetween(Integer value1, Integer value2) {
            addCriterion("gimgid not between", value1, value2, "gimgid");
            return (Criteria) this;
        }

        public Criteria andGimgurlIsNull() {
            addCriterion("gimgurl is null");
            return (Criteria) this;
        }

        public Criteria andGimgurlIsNotNull() {
            addCriterion("gimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andGimgurlEqualTo(String value) {
            addCriterion("gimgurl =", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlNotEqualTo(String value) {
            addCriterion("gimgurl <>", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlGreaterThan(String value) {
            addCriterion("gimgurl >", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("gimgurl >=", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlLessThan(String value) {
            addCriterion("gimgurl <", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlLessThanOrEqualTo(String value) {
            addCriterion("gimgurl <=", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlLike(String value) {
            addCriterion("gimgurl like", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlNotLike(String value) {
            addCriterion("gimgurl not like", value, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlIn(List<String> values) {
            addCriterion("gimgurl in", values, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlNotIn(List<String> values) {
            addCriterion("gimgurl not in", values, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlBetween(String value1, String value2) {
            addCriterion("gimgurl between", value1, value2, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGimgurlNotBetween(String value1, String value2) {
            addCriterion("gimgurl not between", value1, value2, "gimgurl");
            return (Criteria) this;
        }

        public Criteria andGdidIsNull() {
            addCriterion("gdid is null");
            return (Criteria) this;
        }

        public Criteria andGdidIsNotNull() {
            addCriterion("gdid is not null");
            return (Criteria) this;
        }

        public Criteria andGdidEqualTo(Integer value) {
            addCriterion("gdid =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotEqualTo(Integer value) {
            addCriterion("gdid <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThan(Integer value) {
            addCriterion("gdid >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdid >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThan(Integer value) {
            addCriterion("gdid <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThanOrEqualTo(Integer value) {
            addCriterion("gdid <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidIn(List<Integer> values) {
            addCriterion("gdid in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotIn(List<Integer> values) {
            addCriterion("gdid not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidBetween(Integer value1, Integer value2) {
            addCriterion("gdid between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdid not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGimgtypeIsNull() {
            addCriterion("gimgtype is null");
            return (Criteria) this;
        }

        public Criteria andGimgtypeIsNotNull() {
            addCriterion("gimgtype is not null");
            return (Criteria) this;
        }

        public Criteria andGimgtypeEqualTo(Integer value) {
            addCriterion("gimgtype =", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeNotEqualTo(Integer value) {
            addCriterion("gimgtype <>", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeGreaterThan(Integer value) {
            addCriterion("gimgtype >", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gimgtype >=", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeLessThan(Integer value) {
            addCriterion("gimgtype <", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeLessThanOrEqualTo(Integer value) {
            addCriterion("gimgtype <=", value, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeIn(List<Integer> values) {
            addCriterion("gimgtype in", values, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeNotIn(List<Integer> values) {
            addCriterion("gimgtype not in", values, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeBetween(Integer value1, Integer value2) {
            addCriterion("gimgtype between", value1, value2, "gimgtype");
            return (Criteria) this;
        }

        public Criteria andGimgtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gimgtype not between", value1, value2, "gimgtype");
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
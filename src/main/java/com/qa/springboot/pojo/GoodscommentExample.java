package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodscommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodscommentExample() {
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

        public Criteria andGcdateIsNull() {
            addCriterion("gcdate is null");
            return (Criteria) this;
        }

        public Criteria andGcdateIsNotNull() {
            addCriterion("gcdate is not null");
            return (Criteria) this;
        }

        public Criteria andGcdateEqualTo(Date value) {
            addCriterion("gcdate =", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateNotEqualTo(Date value) {
            addCriterion("gcdate <>", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateGreaterThan(Date value) {
            addCriterion("gcdate >", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("gcdate >=", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateLessThan(Date value) {
            addCriterion("gcdate <", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateLessThanOrEqualTo(Date value) {
            addCriterion("gcdate <=", value, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateIn(List<Date> values) {
            addCriterion("gcdate in", values, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateNotIn(List<Date> values) {
            addCriterion("gcdate not in", values, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateBetween(Date value1, Date value2) {
            addCriterion("gcdate between", value1, value2, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGcdateNotBetween(Date value1, Date value2) {
            addCriterion("gcdate not between", value1, value2, "gcdate");
            return (Criteria) this;
        }

        public Criteria andGctypeIsNull() {
            addCriterion("gctype is null");
            return (Criteria) this;
        }

        public Criteria andGctypeIsNotNull() {
            addCriterion("gctype is not null");
            return (Criteria) this;
        }

        public Criteria andGctypeEqualTo(Integer value) {
            addCriterion("gctype =", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeNotEqualTo(Integer value) {
            addCriterion("gctype <>", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeGreaterThan(Integer value) {
            addCriterion("gctype >", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gctype >=", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeLessThan(Integer value) {
            addCriterion("gctype <", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeLessThanOrEqualTo(Integer value) {
            addCriterion("gctype <=", value, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeIn(List<Integer> values) {
            addCriterion("gctype in", values, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeNotIn(List<Integer> values) {
            addCriterion("gctype not in", values, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeBetween(Integer value1, Integer value2) {
            addCriterion("gctype between", value1, value2, "gctype");
            return (Criteria) this;
        }

        public Criteria andGctypeNotBetween(Integer value1, Integer value2) {
            addCriterion("gctype not between", value1, value2, "gctype");
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
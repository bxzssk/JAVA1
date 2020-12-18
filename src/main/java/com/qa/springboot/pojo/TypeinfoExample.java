package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class TypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeinfoExample() {
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

        public Criteria andTpidIsNull() {
            addCriterion("tpid is null");
            return (Criteria) this;
        }

        public Criteria andTpidIsNotNull() {
            addCriterion("tpid is not null");
            return (Criteria) this;
        }

        public Criteria andTpidEqualTo(Integer value) {
            addCriterion("tpid =", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidNotEqualTo(Integer value) {
            addCriterion("tpid <>", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidGreaterThan(Integer value) {
            addCriterion("tpid >", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpid >=", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidLessThan(Integer value) {
            addCriterion("tpid <", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidLessThanOrEqualTo(Integer value) {
            addCriterion("tpid <=", value, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidIn(List<Integer> values) {
            addCriterion("tpid in", values, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidNotIn(List<Integer> values) {
            addCriterion("tpid not in", values, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidBetween(Integer value1, Integer value2) {
            addCriterion("tpid between", value1, value2, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpidNotBetween(Integer value1, Integer value2) {
            addCriterion("tpid not between", value1, value2, "tpid");
            return (Criteria) this;
        }

        public Criteria andTpnameIsNull() {
            addCriterion("tpname is null");
            return (Criteria) this;
        }

        public Criteria andTpnameIsNotNull() {
            addCriterion("tpname is not null");
            return (Criteria) this;
        }

        public Criteria andTpnameEqualTo(String value) {
            addCriterion("tpname =", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameNotEqualTo(String value) {
            addCriterion("tpname <>", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameGreaterThan(String value) {
            addCriterion("tpname >", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameGreaterThanOrEqualTo(String value) {
            addCriterion("tpname >=", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameLessThan(String value) {
            addCriterion("tpname <", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameLessThanOrEqualTo(String value) {
            addCriterion("tpname <=", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameLike(String value) {
            addCriterion("tpname like", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameNotLike(String value) {
            addCriterion("tpname not like", value, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameIn(List<String> values) {
            addCriterion("tpname in", values, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameNotIn(List<String> values) {
            addCriterion("tpname not in", values, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameBetween(String value1, String value2) {
            addCriterion("tpname between", value1, value2, "tpname");
            return (Criteria) this;
        }

        public Criteria andTpnameNotBetween(String value1, String value2) {
            addCriterion("tpname not between", value1, value2, "tpname");
            return (Criteria) this;
        }

        public Criteria andTplevelIsNull() {
            addCriterion("tplevel is null");
            return (Criteria) this;
        }

        public Criteria andTplevelIsNotNull() {
            addCriterion("tplevel is not null");
            return (Criteria) this;
        }

        public Criteria andTplevelEqualTo(Integer value) {
            addCriterion("tplevel =", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelNotEqualTo(Integer value) {
            addCriterion("tplevel <>", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelGreaterThan(Integer value) {
            addCriterion("tplevel >", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tplevel >=", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelLessThan(Integer value) {
            addCriterion("tplevel <", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelLessThanOrEqualTo(Integer value) {
            addCriterion("tplevel <=", value, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelIn(List<Integer> values) {
            addCriterion("tplevel in", values, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelNotIn(List<Integer> values) {
            addCriterion("tplevel not in", values, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelBetween(Integer value1, Integer value2) {
            addCriterion("tplevel between", value1, value2, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTplevelNotBetween(Integer value1, Integer value2) {
            addCriterion("tplevel not between", value1, value2, "tplevel");
            return (Criteria) this;
        }

        public Criteria andTpparentidIsNull() {
            addCriterion("tpparentid is null");
            return (Criteria) this;
        }

        public Criteria andTpparentidIsNotNull() {
            addCriterion("tpparentid is not null");
            return (Criteria) this;
        }

        public Criteria andTpparentidEqualTo(Integer value) {
            addCriterion("tpparentid =", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidNotEqualTo(Integer value) {
            addCriterion("tpparentid <>", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidGreaterThan(Integer value) {
            addCriterion("tpparentid >", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpparentid >=", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidLessThan(Integer value) {
            addCriterion("tpparentid <", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidLessThanOrEqualTo(Integer value) {
            addCriterion("tpparentid <=", value, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidIn(List<Integer> values) {
            addCriterion("tpparentid in", values, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidNotIn(List<Integer> values) {
            addCriterion("tpparentid not in", values, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidBetween(Integer value1, Integer value2) {
            addCriterion("tpparentid between", value1, value2, "tpparentid");
            return (Criteria) this;
        }

        public Criteria andTpparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("tpparentid not between", value1, value2, "tpparentid");
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
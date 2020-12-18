package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsinfoExample() {
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

        public Criteria andGdnameIsNull() {
            addCriterion("gdname is null");
            return (Criteria) this;
        }

        public Criteria andGdnameIsNotNull() {
            addCriterion("gdname is not null");
            return (Criteria) this;
        }

        public Criteria andGdnameEqualTo(String value) {
            addCriterion("gdname =", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameNotEqualTo(String value) {
            addCriterion("gdname <>", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameGreaterThan(String value) {
            addCriterion("gdname >", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameGreaterThanOrEqualTo(String value) {
            addCriterion("gdname >=", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameLessThan(String value) {
            addCriterion("gdname <", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameLessThanOrEqualTo(String value) {
            addCriterion("gdname <=", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameLike(String value) {
            addCriterion("gdname like", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameNotLike(String value) {
            addCriterion("gdname not like", value, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameIn(List<String> values) {
            addCriterion("gdname in", values, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameNotIn(List<String> values) {
            addCriterion("gdname not in", values, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameBetween(String value1, String value2) {
            addCriterion("gdname between", value1, value2, "gdname");
            return (Criteria) this;
        }

        public Criteria andGdnameNotBetween(String value1, String value2) {
            addCriterion("gdname not between", value1, value2, "gdname");
            return (Criteria) this;
        }

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsIsNull() {
            addCriterion("gtkeywords is null");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsIsNotNull() {
            addCriterion("gtkeywords is not null");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsEqualTo(String value) {
            addCriterion("gtkeywords =", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsNotEqualTo(String value) {
            addCriterion("gtkeywords <>", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsGreaterThan(String value) {
            addCriterion("gtkeywords >", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("gtkeywords >=", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsLessThan(String value) {
            addCriterion("gtkeywords <", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsLessThanOrEqualTo(String value) {
            addCriterion("gtkeywords <=", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsLike(String value) {
            addCriterion("gtkeywords like", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsNotLike(String value) {
            addCriterion("gtkeywords not like", value, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsIn(List<String> values) {
            addCriterion("gtkeywords in", values, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsNotIn(List<String> values) {
            addCriterion("gtkeywords not in", values, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsBetween(String value1, String value2) {
            addCriterion("gtkeywords between", value1, value2, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtkeywordsNotBetween(String value1, String value2) {
            addCriterion("gtkeywords not between", value1, value2, "gtkeywords");
            return (Criteria) this;
        }

        public Criteria andGtdateIsNull() {
            addCriterion("gtdate is null");
            return (Criteria) this;
        }

        public Criteria andGtdateIsNotNull() {
            addCriterion("gtdate is not null");
            return (Criteria) this;
        }

        public Criteria andGtdateEqualTo(Date value) {
            addCriterionForJDBCDate("gtdate =", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gtdate <>", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateGreaterThan(Date value) {
            addCriterionForJDBCDate("gtdate >", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gtdate >=", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateLessThan(Date value) {
            addCriterionForJDBCDate("gtdate <", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gtdate <=", value, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateIn(List<Date> values) {
            addCriterionForJDBCDate("gtdate in", values, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gtdate not in", values, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gtdate between", value1, value2, "gtdate");
            return (Criteria) this;
        }

        public Criteria andGtdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gtdate not between", value1, value2, "gtdate");
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
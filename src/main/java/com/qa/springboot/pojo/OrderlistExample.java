package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOlidIsNull() {
            addCriterion("olid is null");
            return (Criteria) this;
        }

        public Criteria andOlidIsNotNull() {
            addCriterion("olid is not null");
            return (Criteria) this;
        }

        public Criteria andOlidEqualTo(String value) {
            addCriterion("olid =", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotEqualTo(String value) {
            addCriterion("olid <>", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThan(String value) {
            addCriterion("olid >", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThanOrEqualTo(String value) {
            addCriterion("olid >=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThan(String value) {
            addCriterion("olid <", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThanOrEqualTo(String value) {
            addCriterion("olid <=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLike(String value) {
            addCriterion("olid like", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotLike(String value) {
            addCriterion("olid not like", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidIn(List<String> values) {
            addCriterion("olid in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotIn(List<String> values) {
            addCriterion("olid not in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidBetween(String value1, String value2) {
            addCriterion("olid between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotBetween(String value1, String value2) {
            addCriterion("olid not between", value1, value2, "olid");
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

        public Criteria andGdcountIsNull() {
            addCriterion("gdcount is null");
            return (Criteria) this;
        }

        public Criteria andGdcountIsNotNull() {
            addCriterion("gdcount is not null");
            return (Criteria) this;
        }

        public Criteria andGdcountEqualTo(Integer value) {
            addCriterion("gdcount =", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountNotEqualTo(Integer value) {
            addCriterion("gdcount <>", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountGreaterThan(Integer value) {
            addCriterion("gdcount >", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdcount >=", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountLessThan(Integer value) {
            addCriterion("gdcount <", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountLessThanOrEqualTo(Integer value) {
            addCriterion("gdcount <=", value, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountIn(List<Integer> values) {
            addCriterion("gdcount in", values, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountNotIn(List<Integer> values) {
            addCriterion("gdcount not in", values, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountBetween(Integer value1, Integer value2) {
            addCriterion("gdcount between", value1, value2, "gdcount");
            return (Criteria) this;
        }

        public Criteria andGdcountNotBetween(Integer value1, Integer value2) {
            addCriterion("gdcount not between", value1, value2, "gdcount");
            return (Criteria) this;
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
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
package com.shtel.test.hello.entity;

import java.util.ArrayList;
import java.util.List;

public class OfferDimensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfferDimensionExample() {
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

        public Criteria andDimensionidIsNull() {
            addCriterion("dimensionid is null");
            return (Criteria) this;
        }

        public Criteria andDimensionidIsNotNull() {
            addCriterion("dimensionid is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionidEqualTo(Integer value) {
            addCriterion("dimensionid =", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidNotEqualTo(Integer value) {
            addCriterion("dimensionid <>", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidGreaterThan(Integer value) {
            addCriterion("dimensionid >", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dimensionid >=", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidLessThan(Integer value) {
            addCriterion("dimensionid <", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidLessThanOrEqualTo(Integer value) {
            addCriterion("dimensionid <=", value, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidIn(List<Integer> values) {
            addCriterion("dimensionid in", values, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidNotIn(List<Integer> values) {
            addCriterion("dimensionid not in", values, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidBetween(Integer value1, Integer value2) {
            addCriterion("dimensionid between", value1, value2, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionidNotBetween(Integer value1, Integer value2) {
            addCriterion("dimensionid not between", value1, value2, "dimensionid");
            return (Criteria) this;
        }

        public Criteria andDimensionnameIsNull() {
            addCriterion("dimensionname is null");
            return (Criteria) this;
        }

        public Criteria andDimensionnameIsNotNull() {
            addCriterion("dimensionname is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionnameEqualTo(String value) {
            addCriterion("dimensionname =", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameNotEqualTo(String value) {
            addCriterion("dimensionname <>", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameGreaterThan(String value) {
            addCriterion("dimensionname >", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameGreaterThanOrEqualTo(String value) {
            addCriterion("dimensionname >=", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameLessThan(String value) {
            addCriterion("dimensionname <", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameLessThanOrEqualTo(String value) {
            addCriterion("dimensionname <=", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameLike(String value) {
            addCriterion("dimensionname like", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameNotLike(String value) {
            addCriterion("dimensionname not like", value, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameIn(List<String> values) {
            addCriterion("dimensionname in", values, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameNotIn(List<String> values) {
            addCriterion("dimensionname not in", values, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameBetween(String value1, String value2) {
            addCriterion("dimensionname between", value1, value2, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andDimensionnameNotBetween(String value1, String value2) {
            addCriterion("dimensionname not between", value1, value2, "dimensionname");
            return (Criteria) this;
        }

        public Criteria andLabbleidIsNull() {
            addCriterion("labbleid is null");
            return (Criteria) this;
        }

        public Criteria andLabbleidIsNotNull() {
            addCriterion("labbleid is not null");
            return (Criteria) this;
        }

        public Criteria andLabbleidEqualTo(Integer value) {
            addCriterion("labbleid =", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidNotEqualTo(Integer value) {
            addCriterion("labbleid <>", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidGreaterThan(Integer value) {
            addCriterion("labbleid >", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("labbleid >=", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidLessThan(Integer value) {
            addCriterion("labbleid <", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidLessThanOrEqualTo(Integer value) {
            addCriterion("labbleid <=", value, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidIn(List<Integer> values) {
            addCriterion("labbleid in", values, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidNotIn(List<Integer> values) {
            addCriterion("labbleid not in", values, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidBetween(Integer value1, Integer value2) {
            addCriterion("labbleid between", value1, value2, "labbleid");
            return (Criteria) this;
        }

        public Criteria andLabbleidNotBetween(Integer value1, Integer value2) {
            addCriterion("labbleid not between", value1, value2, "labbleid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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
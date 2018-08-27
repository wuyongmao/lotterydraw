package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component

public class DRAW_USERExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DRAW_USERExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andZX01IsNull() {
            addCriterion("ZX01 is null");
            return (Criteria) this;
        }

        public Criteria andZX01IsNotNull() {
            addCriterion("ZX01 is not null");
            return (Criteria) this;
        }

        public Criteria andZX01EqualTo(String value) {
            addCriterion("ZX01 =", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01NotEqualTo(String value) {
            addCriterion("ZX01 <>", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01GreaterThan(String value) {
            addCriterion("ZX01 >", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01GreaterThanOrEqualTo(String value) {
            addCriterion("ZX01 >=", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01LessThan(String value) {
            addCriterion("ZX01 <", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01LessThanOrEqualTo(String value) {
            addCriterion("ZX01 <=", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01Like(String value) {
            addCriterion("ZX01 like", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01NotLike(String value) {
            addCriterion("ZX01 not like", value, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01In(List<String> values) {
            addCriterion("ZX01 in", values, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01NotIn(List<String> values) {
            addCriterion("ZX01 not in", values, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01Between(String value1, String value2) {
            addCriterion("ZX01 between", value1, value2, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX01NotBetween(String value1, String value2) {
            addCriterion("ZX01 not between", value1, value2, "ZX01");
            return (Criteria) this;
        }

        public Criteria andZX02IsNull() {
            addCriterion("ZX02 is null");
            return (Criteria) this;
        }

        public Criteria andZX02IsNotNull() {
            addCriterion("ZX02 is not null");
            return (Criteria) this;
        }

        public Criteria andZX02EqualTo(String value) {
            addCriterion("ZX02 =", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02NotEqualTo(String value) {
            addCriterion("ZX02 <>", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02GreaterThan(String value) {
            addCriterion("ZX02 >", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02GreaterThanOrEqualTo(String value) {
            addCriterion("ZX02 >=", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02LessThan(String value) {
            addCriterion("ZX02 <", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02LessThanOrEqualTo(String value) {
            addCriterion("ZX02 <=", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02Like(String value) {
            addCriterion("ZX02 like", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02NotLike(String value) {
            addCriterion("ZX02 not like", value, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02In(List<String> values) {
            addCriterion("ZX02 in", values, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02NotIn(List<String> values) {
            addCriterion("ZX02 not in", values, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02Between(String value1, String value2) {
            addCriterion("ZX02 between", value1, value2, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX02NotBetween(String value1, String value2) {
            addCriterion("ZX02 not between", value1, value2, "ZX02");
            return (Criteria) this;
        }

        public Criteria andZX03IsNull() {
            addCriterion("ZX03 is null");
            return (Criteria) this;
        }

        public Criteria andZX03IsNotNull() {
            addCriterion("ZX03 is not null");
            return (Criteria) this;
        }

        public Criteria andZX03EqualTo(String value) {
            addCriterion("ZX03 =", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03NotEqualTo(String value) {
            addCriterion("ZX03 <>", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03GreaterThan(String value) {
            addCriterion("ZX03 >", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03GreaterThanOrEqualTo(String value) {
            addCriterion("ZX03 >=", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03LessThan(String value) {
            addCriterion("ZX03 <", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03LessThanOrEqualTo(String value) {
            addCriterion("ZX03 <=", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03Like(String value) {
            addCriterion("ZX03 like", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03NotLike(String value) {
            addCriterion("ZX03 not like", value, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03In(List<String> values) {
            addCriterion("ZX03 in", values, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03NotIn(List<String> values) {
            addCriterion("ZX03 not in", values, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03Between(String value1, String value2) {
            addCriterion("ZX03 between", value1, value2, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZX03NotBetween(String value1, String value2) {
            addCriterion("ZX03 not between", value1, value2, "ZX03");
            return (Criteria) this;
        }

        public Criteria andZXACTIIsNull() {
            addCriterion("ZXACTI is null");
            return (Criteria) this;
        }

        public Criteria andZXACTIIsNotNull() {
            addCriterion("ZXACTI is not null");
            return (Criteria) this;
        }

        public Criteria andZXACTIEqualTo(String value) {
            addCriterion("ZXACTI =", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTINotEqualTo(String value) {
            addCriterion("ZXACTI <>", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTIGreaterThan(String value) {
            addCriterion("ZXACTI >", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTIGreaterThanOrEqualTo(String value) {
            addCriterion("ZXACTI >=", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTILessThan(String value) {
            addCriterion("ZXACTI <", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTILessThanOrEqualTo(String value) {
            addCriterion("ZXACTI <=", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTILike(String value) {
            addCriterion("ZXACTI like", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTINotLike(String value) {
            addCriterion("ZXACTI not like", value, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTIIn(List<String> values) {
            addCriterion("ZXACTI in", values, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTINotIn(List<String> values) {
            addCriterion("ZXACTI not in", values, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTIBetween(String value1, String value2) {
            addCriterion("ZXACTI between", value1, value2, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andZXACTINotBetween(String value1, String value2) {
            addCriterion("ZXACTI not between", value1, value2, "ZXACTI");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELIsNull() {
            addCriterion("DRAW_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELIsNotNull() {
            addCriterion("DRAW_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELEqualTo(String value) {
            addCriterion("DRAW_LEVEL =", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELNotEqualTo(String value) {
            addCriterion("DRAW_LEVEL <>", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELGreaterThan(String value) {
            addCriterion("DRAW_LEVEL >", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELGreaterThanOrEqualTo(String value) {
            addCriterion("DRAW_LEVEL >=", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELLessThan(String value) {
            addCriterion("DRAW_LEVEL <", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELLessThanOrEqualTo(String value) {
            addCriterion("DRAW_LEVEL <=", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELLike(String value) {
            addCriterion("DRAW_LEVEL like", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELNotLike(String value) {
            addCriterion("DRAW_LEVEL not like", value, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELIn(List<String> values) {
            addCriterion("DRAW_LEVEL in", values, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELNotIn(List<String> values) {
            addCriterion("DRAW_LEVEL not in", values, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELBetween(String value1, String value2) {
            addCriterion("DRAW_LEVEL between", value1, value2, "DRAW_LEVEL");
            return (Criteria) this;
        }

        public Criteria andDRAW_LEVELNotBetween(String value1, String value2) {
            addCriterion("DRAW_LEVEL not between", value1, value2, "DRAW_LEVEL");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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
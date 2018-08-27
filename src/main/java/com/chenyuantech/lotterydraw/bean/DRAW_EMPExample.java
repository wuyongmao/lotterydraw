package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component

public class DRAW_EMPExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DRAW_EMPExample() {
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

        public Criteria andGEN01IsNull() {
            addCriterion("GEN01 is null");
            return (Criteria) this;
        }

        public Criteria andGEN01IsNotNull() {
            addCriterion("GEN01 is not null");
            return (Criteria) this;
        }

        public Criteria andGEN01EqualTo(String value) {
            addCriterion("GEN01 =", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01NotEqualTo(String value) {
            addCriterion("GEN01 <>", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01GreaterThan(String value) {
            addCriterion("GEN01 >", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01GreaterThanOrEqualTo(String value) {
            addCriterion("GEN01 >=", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01LessThan(String value) {
            addCriterion("GEN01 <", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01LessThanOrEqualTo(String value) {
            addCriterion("GEN01 <=", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01Like(String value) {
            addCriterion("GEN01 like", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01NotLike(String value) {
            addCriterion("GEN01 not like", value, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01In(List<String> values) {
            addCriterion("GEN01 in", values, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01NotIn(List<String> values) {
            addCriterion("GEN01 not in", values, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01Between(String value1, String value2) {
            addCriterion("GEN01 between", value1, value2, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN01NotBetween(String value1, String value2) {
            addCriterion("GEN01 not between", value1, value2, "GEN01");
            return (Criteria) this;
        }

        public Criteria andGEN02IsNull() {
            addCriterion("GEN02 is null");
            return (Criteria) this;
        }

        public Criteria andGEN02IsNotNull() {
            addCriterion("GEN02 is not null");
            return (Criteria) this;
        }

        public Criteria andGEN02EqualTo(String value) {
            addCriterion("GEN02 =", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotEqualTo(String value) {
            addCriterion("GEN02 <>", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02GreaterThan(String value) {
            addCriterion("GEN02 >", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02GreaterThanOrEqualTo(String value) {
            addCriterion("GEN02 >=", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02LessThan(String value) {
            addCriterion("GEN02 <", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02LessThanOrEqualTo(String value) {
            addCriterion("GEN02 <=", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02Like(String value) {
            addCriterion("GEN02 like", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotLike(String value) {
            addCriterion("GEN02 not like", value, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02In(List<String> values) {
            addCriterion("GEN02 in", values, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotIn(List<String> values) {
            addCriterion("GEN02 not in", values, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02Between(String value1, String value2) {
            addCriterion("GEN02 between", value1, value2, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEN02NotBetween(String value1, String value2) {
            addCriterion("GEN02 not between", value1, value2, "GEN02");
            return (Criteria) this;
        }

        public Criteria andGEM02IsNull() {
            addCriterion("GEM02 is null");
            return (Criteria) this;
        }

        public Criteria andGEM02IsNotNull() {
            addCriterion("GEM02 is not null");
            return (Criteria) this;
        }

        public Criteria andGEM02EqualTo(String value) {
            addCriterion("GEM02 =", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotEqualTo(String value) {
            addCriterion("GEM02 <>", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02GreaterThan(String value) {
            addCriterion("GEM02 >", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02GreaterThanOrEqualTo(String value) {
            addCriterion("GEM02 >=", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02LessThan(String value) {
            addCriterion("GEM02 <", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02LessThanOrEqualTo(String value) {
            addCriterion("GEM02 <=", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02Like(String value) {
            addCriterion("GEM02 like", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotLike(String value) {
            addCriterion("GEM02 not like", value, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02In(List<String> values) {
            addCriterion("GEM02 in", values, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotIn(List<String> values) {
            addCriterion("GEM02 not in", values, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02Between(String value1, String value2) {
            addCriterion("GEM02 between", value1, value2, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEM02NotBetween(String value1, String value2) {
            addCriterion("GEM02 not between", value1, value2, "GEM02");
            return (Criteria) this;
        }

        public Criteria andGEMACTIIsNull() {
            addCriterion("GEMACTI is null");
            return (Criteria) this;
        }

        public Criteria andGEMACTIIsNotNull() {
            addCriterion("GEMACTI is not null");
            return (Criteria) this;
        }

        public Criteria andGEMACTIEqualTo(String value) {
            addCriterion("GEMACTI =", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTINotEqualTo(String value) {
            addCriterion("GEMACTI <>", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTIGreaterThan(String value) {
            addCriterion("GEMACTI >", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTIGreaterThanOrEqualTo(String value) {
            addCriterion("GEMACTI >=", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTILessThan(String value) {
            addCriterion("GEMACTI <", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTILessThanOrEqualTo(String value) {
            addCriterion("GEMACTI <=", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTILike(String value) {
            addCriterion("GEMACTI like", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTINotLike(String value) {
            addCriterion("GEMACTI not like", value, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTIIn(List<String> values) {
            addCriterion("GEMACTI in", values, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTINotIn(List<String> values) {
            addCriterion("GEMACTI not in", values, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTIBetween(String value1, String value2) {
            addCriterion("GEMACTI between", value1, value2, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEMACTINotBetween(String value1, String value2) {
            addCriterion("GEMACTI not between", value1, value2, "GEMACTI");
            return (Criteria) this;
        }

        public Criteria andGEN03IsNull() {
            addCriterion("GEN03 is null");
            return (Criteria) this;
        }

        public Criteria andGEN03IsNotNull() {
            addCriterion("GEN03 is not null");
            return (Criteria) this;
        }

        public Criteria andGEN03EqualTo(String value) {
            addCriterion("GEN03 =", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03NotEqualTo(String value) {
            addCriterion("GEN03 <>", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03GreaterThan(String value) {
            addCriterion("GEN03 >", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03GreaterThanOrEqualTo(String value) {
            addCriterion("GEN03 >=", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03LessThan(String value) {
            addCriterion("GEN03 <", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03LessThanOrEqualTo(String value) {
            addCriterion("GEN03 <=", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03Like(String value) {
            addCriterion("GEN03 like", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03NotLike(String value) {
            addCriterion("GEN03 not like", value, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03In(List<String> values) {
            addCriterion("GEN03 in", values, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03NotIn(List<String> values) {
            addCriterion("GEN03 not in", values, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03Between(String value1, String value2) {
            addCriterion("GEN03 between", value1, value2, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGEN03NotBetween(String value1, String value2) {
            addCriterion("GEN03 not between", value1, value2, "GEN03");
            return (Criteria) this;
        }

        public Criteria andGENACTIIsNull() {
            addCriterion("GENACTI is null");
            return (Criteria) this;
        }

        public Criteria andGENACTIIsNotNull() {
            addCriterion("GENACTI is not null");
            return (Criteria) this;
        }

        public Criteria andGENACTIEqualTo(String value) {
            addCriterion("GENACTI =", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTINotEqualTo(String value) {
            addCriterion("GENACTI <>", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTIGreaterThan(String value) {
            addCriterion("GENACTI >", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTIGreaterThanOrEqualTo(String value) {
            addCriterion("GENACTI >=", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTILessThan(String value) {
            addCriterion("GENACTI <", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTILessThanOrEqualTo(String value) {
            addCriterion("GENACTI <=", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTILike(String value) {
            addCriterion("GENACTI like", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTINotLike(String value) {
            addCriterion("GENACTI not like", value, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTIIn(List<String> values) {
            addCriterion("GENACTI in", values, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTINotIn(List<String> values) {
            addCriterion("GENACTI not in", values, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTIBetween(String value1, String value2) {
            addCriterion("GENACTI between", value1, value2, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENACTINotBetween(String value1, String value2) {
            addCriterion("GENACTI not between", value1, value2, "GENACTI");
            return (Criteria) this;
        }

        public Criteria andGENDATEIsNull() {
            addCriterion("GENDATE is null");
            return (Criteria) this;
        }

        public Criteria andGENDATEIsNotNull() {
            addCriterion("GENDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGENDATEEqualTo(Date value) {
            addCriterionForJDBCDate("GENDATE =", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("GENDATE <>", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("GENDATE >", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GENDATE >=", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATELessThan(Date value) {
            addCriterionForJDBCDate("GENDATE <", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GENDATE <=", value, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATEIn(List<Date> values) {
            addCriterionForJDBCDate("GENDATE in", values, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("GENDATE not in", values, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GENDATE between", value1, value2, "GENDATE");
            return (Criteria) this;
        }

        public Criteria andGENDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GENDATE not between", value1, value2, "GENDATE");
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
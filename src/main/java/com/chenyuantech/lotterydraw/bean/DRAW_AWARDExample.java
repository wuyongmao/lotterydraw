package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class DRAW_AWARDExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DRAW_AWARDExample() {
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

        public Criteria andNDIsNull() {
            addCriterion("ND is null");
            return (Criteria) this;
        }

        public Criteria andNDIsNotNull() {
            addCriterion("ND is not null");
            return (Criteria) this;
        }

        public Criteria andNDEqualTo(BigDecimal value) {
            addCriterion("ND =", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDNotEqualTo(BigDecimal value) {
            addCriterion("ND <>", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDGreaterThan(BigDecimal value) {
            addCriterion("ND >", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ND >=", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDLessThan(BigDecimal value) {
            addCriterion("ND <", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ND <=", value, "ND");
            return (Criteria) this;
        }

        public Criteria andNDIn(List<BigDecimal> values) {
            addCriterion("ND in", values, "ND");
            return (Criteria) this;
        }

        public Criteria andNDNotIn(List<BigDecimal> values) {
            addCriterion("ND not in", values, "ND");
            return (Criteria) this;
        }

        public Criteria andNDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ND between", value1, value2, "ND");
            return (Criteria) this;
        }

        public Criteria andNDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ND not between", value1, value2, "ND");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELIsNull() {
            addCriterion("AWARD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELIsNotNull() {
            addCriterion("AWARD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELEqualTo(String value) {
            addCriterion("AWARD_LEVEL =", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELNotEqualTo(String value) {
            addCriterion("AWARD_LEVEL <>", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELGreaterThan(String value) {
            addCriterion("AWARD_LEVEL >", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELGreaterThanOrEqualTo(String value) {
            addCriterion("AWARD_LEVEL >=", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELLessThan(String value) {
            addCriterion("AWARD_LEVEL <", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELLessThanOrEqualTo(String value) {
            addCriterion("AWARD_LEVEL <=", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELLike(String value) {
            addCriterion("AWARD_LEVEL like", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELNotLike(String value) {
            addCriterion("AWARD_LEVEL not like", value, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELIn(List<String> values) {
            addCriterion("AWARD_LEVEL in", values, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELNotIn(List<String> values) {
            addCriterion("AWARD_LEVEL not in", values, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELBetween(String value1, String value2) {
            addCriterion("AWARD_LEVEL between", value1, value2, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARD_LEVELNotBetween(String value1, String value2) {
            addCriterion("AWARD_LEVEL not between", value1, value2, "AWARD_LEVEL");
            return (Criteria) this;
        }

        public Criteria andAWARDIsNull() {
            addCriterion("AWARD is null");
            return (Criteria) this;
        }

        public Criteria andAWARDIsNotNull() {
            addCriterion("AWARD is not null");
            return (Criteria) this;
        }

        public Criteria andAWARDEqualTo(String value) {
            addCriterion("AWARD =", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDNotEqualTo(String value) {
            addCriterion("AWARD <>", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDGreaterThan(String value) {
            addCriterion("AWARD >", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDGreaterThanOrEqualTo(String value) {
            addCriterion("AWARD >=", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDLessThan(String value) {
            addCriterion("AWARD <", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDLessThanOrEqualTo(String value) {
            addCriterion("AWARD <=", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDLike(String value) {
            addCriterion("AWARD like", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDNotLike(String value) {
            addCriterion("AWARD not like", value, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDIn(List<String> values) {
            addCriterion("AWARD in", values, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDNotIn(List<String> values) {
            addCriterion("AWARD not in", values, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDBetween(String value1, String value2) {
            addCriterion("AWARD between", value1, value2, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARDNotBetween(String value1, String value2) {
            addCriterion("AWARD not between", value1, value2, "AWARD");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMIsNull() {
            addCriterion("AWARD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMIsNotNull() {
            addCriterion("AWARD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMEqualTo(BigDecimal value) {
            addCriterion("AWARD_NUM =", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMNotEqualTo(BigDecimal value) {
            addCriterion("AWARD_NUM <>", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMGreaterThan(BigDecimal value) {
            addCriterion("AWARD_NUM >", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AWARD_NUM >=", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMLessThan(BigDecimal value) {
            addCriterion("AWARD_NUM <", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AWARD_NUM <=", value, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMIn(List<BigDecimal> values) {
            addCriterion("AWARD_NUM in", values, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMNotIn(List<BigDecimal> values) {
            addCriterion("AWARD_NUM not in", values, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AWARD_NUM between", value1, value2, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andAWARD_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AWARD_NUM not between", value1, value2, "AWARD_NUM");
            return (Criteria) this;
        }

        public Criteria andITEMIsNull() {
            addCriterion("ITEM is null");
            return (Criteria) this;
        }

        public Criteria andITEMIsNotNull() {
            addCriterion("ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andITEMEqualTo(BigDecimal value) {
            addCriterion("ITEM =", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMNotEqualTo(BigDecimal value) {
            addCriterion("ITEM <>", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMGreaterThan(BigDecimal value) {
            addCriterion("ITEM >", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM >=", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMLessThan(BigDecimal value) {
            addCriterion("ITEM <", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM <=", value, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMIn(List<BigDecimal> values) {
            addCriterion("ITEM in", values, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMNotIn(List<BigDecimal> values) {
            addCriterion("ITEM not in", values, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM between", value1, value2, "ITEM");
            return (Criteria) this;
        }

        public Criteria andITEMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM not between", value1, value2, "ITEM");
            return (Criteria) this;
        }

        public Criteria andFLAGIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFLAGIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFLAGEqualTo(String value) {
            addCriterion("FLAG =", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGGreaterThan(String value) {
            addCriterion("FLAG >", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGLessThan(String value) {
            addCriterion("FLAG <", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGLike(String value) {
            addCriterion("FLAG like", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotLike(String value) {
            addCriterion("FLAG not like", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGIn(List<String> values) {
            addCriterion("FLAG in", values, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "FLAG");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMIsNull() {
            addCriterion("EVERYNUM is null");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMIsNotNull() {
            addCriterion("EVERYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMEqualTo(BigDecimal value) {
            addCriterion("EVERYNUM =", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMNotEqualTo(BigDecimal value) {
            addCriterion("EVERYNUM <>", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMGreaterThan(BigDecimal value) {
            addCriterion("EVERYNUM >", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVERYNUM >=", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMLessThan(BigDecimal value) {
            addCriterion("EVERYNUM <", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVERYNUM <=", value, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMIn(List<BigDecimal> values) {
            addCriterion("EVERYNUM in", values, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMNotIn(List<BigDecimal> values) {
            addCriterion("EVERYNUM not in", values, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVERYNUM between", value1, value2, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andEVERYNUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVERYNUM not between", value1, value2, "EVERYNUM");
            return (Criteria) this;
        }

        public Criteria andMANAGERIsNull() {
            addCriterion("MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andMANAGERIsNotNull() {
            addCriterion("MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andMANAGEREqualTo(String value) {
            addCriterion("MANAGER =", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERNotEqualTo(String value) {
            addCriterion("MANAGER <>", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERGreaterThan(String value) {
            addCriterion("MANAGER >", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER >=", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERLessThan(String value) {
            addCriterion("MANAGER <", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERLessThanOrEqualTo(String value) {
            addCriterion("MANAGER <=", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERLike(String value) {
            addCriterion("MANAGER like", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERNotLike(String value) {
            addCriterion("MANAGER not like", value, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERIn(List<String> values) {
            addCriterion("MANAGER in", values, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERNotIn(List<String> values) {
            addCriterion("MANAGER not in", values, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERBetween(String value1, String value2) {
            addCriterion("MANAGER between", value1, value2, "MANAGER");
            return (Criteria) this;
        }

        public Criteria andMANAGERNotBetween(String value1, String value2) {
            addCriterion("MANAGER not between", value1, value2, "MANAGER");
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
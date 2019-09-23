/**
 */
package automatedresttesting.impl;

import automatedresttesting.AttributeType;
import automatedresttesting.AutomatedresttestingPackage;
import automatedresttesting.Expression;
import automatedresttesting.Literal;
import automatedresttesting.RelationalOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.impl.ExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link automatedresttesting.impl.ExpressionImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link automatedresttesting.impl.ExpressionImpl#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeType TYPE_EDEFAULT = AttributeType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AttributeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperator RELATIONAL_OPERATOR_EDEFAULT = RelationalOperator.MINOR;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperator relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpectedValue() <em>Expected Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected Literal expectedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomatedresttestingPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AttributeType newType) {
		AttributeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.EXPRESSION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		AttributeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AutomatedresttestingPackage.EXPRESSION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalOperator(RelationalOperator newRelationalOperator) {
		RelationalOperator oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.EXPRESSION__RELATIONAL_OPERATOR, oldRelationalOperator, relationalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getExpectedValue() {
		return expectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedValue(Literal newExpectedValue, NotificationChain msgs) {
		Literal oldExpectedValue = expectedValue;
		expectedValue = newExpectedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE, oldExpectedValue, newExpectedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedValue(Literal newExpectedValue) {
		if (newExpectedValue != expectedValue) {
			NotificationChain msgs = null;
			if (expectedValue != null)
				msgs = ((InternalEObject)expectedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE, null, msgs);
			if (newExpectedValue != null)
				msgs = ((InternalEObject)newExpectedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE, null, msgs);
			msgs = basicSetExpectedValue(newExpectedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE, newExpectedValue, newExpectedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE:
				return basicSetExpectedValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AutomatedresttestingPackage.EXPRESSION__TYPE:
				return getType();
			case AutomatedresttestingPackage.EXPRESSION__RELATIONAL_OPERATOR:
				return getRelationalOperator();
			case AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE:
				return getExpectedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AutomatedresttestingPackage.EXPRESSION__TYPE:
				setType((AttributeType)newValue);
				return;
			case AutomatedresttestingPackage.EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator((RelationalOperator)newValue);
				return;
			case AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE:
				setExpectedValue((Literal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AutomatedresttestingPackage.EXPRESSION__TYPE:
				unsetType();
				return;
			case AutomatedresttestingPackage.EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
				return;
			case AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE:
				setExpectedValue((Literal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AutomatedresttestingPackage.EXPRESSION__TYPE:
				return isSetType();
			case AutomatedresttestingPackage.EXPRESSION__RELATIONAL_OPERATOR:
				return relationalOperator != RELATIONAL_OPERATOR_EDEFAULT;
			case AutomatedresttestingPackage.EXPRESSION__EXPECTED_VALUE:
				return expectedValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", relationalOperator: ");
		result.append(relationalOperator);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl

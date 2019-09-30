/**
 */
package automatedresttesting.impl;

import automatedresttesting.Assertion;
import automatedresttesting.AssertionType;
import automatedresttesting.AutomatedresttestingPackage;
import automatedresttesting.Element;
import automatedresttesting.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.impl.AssertionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link automatedresttesting.impl.AssertionImpl#getDataToTest <em>Data To Test</em>}</li>
 *   <li>{@link automatedresttesting.impl.AssertionImpl#getAssertionType <em>Assertion Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionImpl extends MinimalEObjectImpl.Container implements Assertion {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getDataToTest() <em>Data To Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToTest()
	 * @generated
	 * @ordered
	 */
	protected Element dataToTest;

	/**
	 * The default value of the '{@link #getAssertionType() <em>Assertion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionType()
	 * @generated
	 * @ordered
	 */
	protected static final AssertionType ASSERTION_TYPE_EDEFAULT = AssertionType.RESPONSE;

	/**
	 * The cached value of the '{@link #getAssertionType() <em>Assertion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertionType()
	 * @generated
	 * @ordered
	 */
	protected AssertionType assertionType = ASSERTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomatedresttestingPackage.Literals.ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.ASSERTION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutomatedresttestingPackage.ASSERTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutomatedresttestingPackage.ASSERTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.ASSERTION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getDataToTest() {
		if (dataToTest != null && dataToTest.eIsProxy()) {
			InternalEObject oldDataToTest = (InternalEObject)dataToTest;
			dataToTest = (Element)eResolveProxy(oldDataToTest);
			if (dataToTest != oldDataToTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST, oldDataToTest, dataToTest));
			}
		}
		return dataToTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetDataToTest() {
		return dataToTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataToTest(Element newDataToTest) {
		Element oldDataToTest = dataToTest;
		dataToTest = newDataToTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST, oldDataToTest, dataToTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionType getAssertionType() {
		return assertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertionType(AssertionType newAssertionType) {
		AssertionType oldAssertionType = assertionType;
		assertionType = newAssertionType == null ? ASSERTION_TYPE_EDEFAULT : newAssertionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.ASSERTION__ASSERTION_TYPE, oldAssertionType, assertionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutomatedresttestingPackage.ASSERTION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case AutomatedresttestingPackage.ASSERTION__CONDITION:
				return getCondition();
			case AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST:
				if (resolve) return getDataToTest();
				return basicGetDataToTest();
			case AutomatedresttestingPackage.ASSERTION__ASSERTION_TYPE:
				return getAssertionType();
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
			case AutomatedresttestingPackage.ASSERTION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST:
				setDataToTest((Element)newValue);
				return;
			case AutomatedresttestingPackage.ASSERTION__ASSERTION_TYPE:
				setAssertionType((AssertionType)newValue);
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
			case AutomatedresttestingPackage.ASSERTION__CONDITION:
				setCondition((Expression)null);
				return;
			case AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST:
				setDataToTest((Element)null);
				return;
			case AutomatedresttestingPackage.ASSERTION__ASSERTION_TYPE:
				setAssertionType(ASSERTION_TYPE_EDEFAULT);
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
			case AutomatedresttestingPackage.ASSERTION__CONDITION:
				return condition != null;
			case AutomatedresttestingPackage.ASSERTION__DATA_TO_TEST:
				return dataToTest != null;
			case AutomatedresttestingPackage.ASSERTION__ASSERTION_TYPE:
				return assertionType != ASSERTION_TYPE_EDEFAULT;
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
		result.append(" (assertionType: ");
		result.append(assertionType);
		result.append(')');
		return result.toString();
	}

} //AssertionImpl

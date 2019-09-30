/**
 */
package automatedresttesting.impl;

import automatedresttesting.AutomatedRestTesting;
import automatedresttesting.AutomatedresttestingPackage;
import automatedresttesting.Element;
import automatedresttesting.RestService;
import automatedresttesting.Test;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automated Rest Testing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.impl.AutomatedRestTestingImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link automatedresttesting.impl.AutomatedRestTestingImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link automatedresttesting.impl.AutomatedRestTestingImpl#getServices <em>Services</em>}</li>
 *   <li>{@link automatedresttesting.impl.AutomatedRestTestingImpl#getDataElements <em>Data Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomatedRestTestingImpl extends MinimalEObjectImpl.Container implements AutomatedRestTesting {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<RestService> services;

	/**
	 * The cached value of the '{@link #getDataElements() <em>Data Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> dataElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomatedRestTestingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomatedresttestingPackage.Literals.AUTOMATED_REST_TESTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatedresttestingPackage.AUTOMATED_REST_TESTING__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<Test>(Test.class, this, AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<RestService>(RestService.class, this, AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getDataElements() {
		if (dataElements == null) {
			dataElements = new EObjectContainmentEList<Element>(Element.class, this, AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS);
		}
		return dataElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS:
				return ((InternalEList<?>)getDataElements()).basicRemove(otherEnd, msgs);
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
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__URL:
				return getUrl();
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS:
				return getTests();
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES:
				return getServices();
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS:
				return getDataElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__URL:
				setUrl((String)newValue);
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends RestService>)newValue);
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS:
				getDataElements().clear();
				getDataElements().addAll((Collection<? extends Element>)newValue);
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
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS:
				getTests().clear();
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES:
				getServices().clear();
				return;
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS:
				getDataElements().clear();
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
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__TESTS:
				return tests != null && !tests.isEmpty();
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__SERVICES:
				return services != null && !services.isEmpty();
			case AutomatedresttestingPackage.AUTOMATED_REST_TESTING__DATA_ELEMENTS:
				return dataElements != null && !dataElements.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //AutomatedRestTestingImpl

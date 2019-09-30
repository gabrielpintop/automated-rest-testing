/**
 */
package automatedresttesting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Separator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see automatedresttesting.AutomatedresttestingPackage#getSeparatorType()
 * @model
 * @generated
 */
public enum SeparatorType implements Enumerator {
	/**
	 * The '<em><b>Slash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLASH_VALUE
	 * @generated
	 * @ordered
	 */
	SLASH(0, "Slash", "/"),

	/**
	 * The '<em><b>Et</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ET_VALUE
	 * @generated
	 * @ordered
	 */
	ET(1, "Et", "&"),

	/**
	 * The '<em><b>Question Mark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION_MARK_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTION_MARK(2, "QuestionMark", "?");

	/**
	 * The '<em><b>Slash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLASH
	 * @model name="Slash" literal="/"
	 * @generated
	 * @ordered
	 */
	public static final int SLASH_VALUE = 0;

	/**
	 * The '<em><b>Et</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ET
	 * @model name="Et" literal="&amp;"
	 * @generated
	 * @ordered
	 */
	public static final int ET_VALUE = 1;

	/**
	 * The '<em><b>Question Mark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTION_MARK
	 * @model name="QuestionMark" literal="?"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTION_MARK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Separator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeparatorType[] VALUES_ARRAY =
		new SeparatorType[] {
			SLASH,
			ET,
			QUESTION_MARK,
		};

	/**
	 * A public read-only list of all the '<em><b>Separator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeparatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Separator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeparatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeparatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeparatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeparatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeparatorType get(int value) {
		switch (value) {
			case SLASH_VALUE: return SLASH;
			case ET_VALUE: return ET;
			case QUESTION_MARK_VALUE: return QUESTION_MARK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SeparatorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SeparatorType

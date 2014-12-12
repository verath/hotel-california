/**
 */
package tda593.hotel.california;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.CaliforniaPackage
 * @generated
 */
public interface CaliforniaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaliforniaFactory eINSTANCE = tda593.hotel.california.impl.CaliforniaFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CaliforniaPackage getCaliforniaPackage();

} //CaliforniaFactory

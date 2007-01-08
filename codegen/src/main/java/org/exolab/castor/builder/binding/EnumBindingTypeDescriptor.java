/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.5</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding;

/**
 * Class EnumBindingTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public final class EnumBindingTypeDescriptor
extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public EnumBindingTypeDescriptor() {
        super();
        _nsURI = "http://www.castor.org/SourceGenerator/Binding";
        _xmlName = "enumBindingType";
        _elementDefinition = false;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _enumClassName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(
                org.exolab.castor.builder.binding.EnumClassName.class,
                "_enumClassName", "enumClassName", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue(final java.lang.Object object) 
                throws IllegalStateException {
                EnumBindingType target = (EnumBindingType) object;
                return target.getEnumClassName();
            }
            public void setValue(final java.lang.Object object, final java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.setEnumClassName(
                            (org.exolab.castor.builder.binding.EnumClassName) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance(final java.lang.Object parent) {
                return new org.exolab.castor.builder.binding.EnumClassName();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _enumClassName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        desc.setValidator(fieldValidator);
        //-- _enumMemberList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(
                org.exolab.castor.builder.binding.EnumMember.class,
                "_enumMemberList", "enumMember", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue(final java.lang.Object object) 
                throws IllegalStateException {
                EnumBindingType target = (EnumBindingType) object;
                return target.getEnumMember();
            }
            public void setValue(final java.lang.Object object, final java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.addEnumMember((org.exolab.castor.builder.binding.EnumMember) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(final Object object)
            throws IllegalStateException, IllegalArgumentException {
                try {
                    EnumBindingType target = (EnumBindingType) object;
                    target.removeAllEnumMember();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance(final java.lang.Object parent) {
                return new org.exolab.castor.builder.binding.EnumMember();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        
        //-- validation code for: _enumMemberList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        desc.setValidator(fieldValidator);
    } //-- org.exolab.castor.builder.binding.EnumBindingTypeDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode() {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
     * Method getExtends.
     * 
     * @return the class descriptor of the class extended by this
     * class.
     */
    public org.exolab.castor.mapping.ClassDescriptor getExtends() {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity() {
        return _identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    public java.lang.Class getJavaClass() {
        return org.exolab.castor.builder.binding.EnumBindingType.class;
    } //-- java.lang.Class getJavaClass() 

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshalling as XML.
     */
    public java.lang.String getNameSpacePrefix() {
        return _nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshalling and
     * unmarshalling as XML.
     */
    public java.lang.String getNameSpaceURI() {
        return _nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    public org.exolab.castor.xml.TypeValidator getValidator() {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    public java.lang.String getXMLName() {
        return _xmlName;
    } //-- java.lang.String getXMLName() 

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition() {
        return _elementDefinition;
    } //-- boolean isElementDefinition() 

}
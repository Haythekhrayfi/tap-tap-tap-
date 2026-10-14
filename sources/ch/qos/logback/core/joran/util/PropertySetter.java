package ch.qos.logback.core.joran.util;

import androidx.activity.j;
import androidx.activity.result.c;
import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class PropertySetter extends ContextAwareBase {
    public MethodDescriptor[] methodDescriptors;
    public Object obj;
    public Class<?> objClass;
    public PropertyDescriptor[] propertyDescriptors;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3696a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f3696a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3696a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3696a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3696a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3696a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PropertySetter(Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
    }

    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod == null) {
            return AggregationType.NOT_FOUND;
        }
        return StringToObjectConverter.canBeBuiltFromSimpleString(parameterClassForMethod) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Method findAdderMethod(String str) {
        return getMethod("add" + capitalizeFirstLetter(str));
    }

    private Method findSetterMethod(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isSanityCheckSuccessful(String str, Method method, Class<?>[] clsArr, Object obj) {
        StringBuilder sb2;
        String name;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            sb2 = c.a("Wrong number of parameters in setter method for property [", str, "] in ");
            name = this.obj.getClass().getName();
        } else {
            if (clsArr[0].isAssignableFrom(obj.getClass())) {
                return true;
            }
            StringBuilder sbA = defpackage.a.a("A \"");
            sbA.append(cls.getName());
            sbA.append("\" object is not assignable to a \"");
            sbA.append(clsArr[0].getName());
            sbA.append("\" variable.");
            addError(sbA.toString());
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(cls.getName());
            sb2.append("\" was loaded by [");
            sb2.append(cls.getClassLoader());
            name = "].";
        }
        sb2.append(name);
        addError(sb2.toString());
        return false;
    }

    private boolean isUnequivocallyInstantiable(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null;
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        Method methodFindAdderMethod = findAdderMethod(strCapitalizeFirstLetter);
        if (methodFindAdderMethod == null) {
            addError("No adder for property [" + strCapitalizeFirstLetter + "].");
            return;
        }
        Class<?>[] parameterTypes = methodFindAdderMethod.getParameterTypes();
        isSanityCheckSuccessful(strCapitalizeFirstLetter, methodFindAdderMethod, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, str2);
            }
        } catch (Throwable th) {
            StringBuilder sbA = defpackage.a.a("Conversion to type [");
            sbA.append(parameterTypes[0]);
            sbA.append("] failed. ");
            addError(sbA.toString(), th);
        }
    }

    public void addComplexProperty(String str, Object obj) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            if (isSanityCheckSuccessful(str, methodFindAdderMethod, methodFindAdderMethod.getParameterTypes(), obj)) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, obj);
            }
        } else {
            StringBuilder sbA = c.a("Could not find method [add", str, "] in class [");
            sbA.append(this.objClass.getName());
            sbA.append("].");
            addError(sbA.toString());
        }
    }

    public AggregationType computeAggregationType(String str) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            AggregationType aggregationTypeComputeRawAggregationType = computeRawAggregationType(methodFindAdderMethod);
            int i10 = a.f3696a[aggregationTypeComputeRawAggregationType.ordinal()];
            if (i10 == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i10 == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i10 == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i10 == 4 || i10 == 5) {
                addError("Unexpected AggregationType " + aggregationTypeComputeRawAggregationType);
            }
        }
        Method methodFindSetterMethod = findSetterMethod(str);
        return methodFindSetterMethod != null ? computeRawAggregationType(methodFindSetterMethod) : AggregationType.NOT_FOUND;
    }

    public <T extends Annotation> T getAnnotation(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    public Class<?> getByConcreteType(String str, Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod != null && isUnequivocallyInstantiable(parameterClassForMethod)) {
            return parameterClassForMethod;
        }
        return null;
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> clsFindDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.obj.getClass(), str);
        if (clsFindDefaultComponentType != null) {
            return clsFindDefaultComponentType;
        }
        Method relevantMethod = getRelevantMethod(str, aggregationType);
        if (relevantMethod == null) {
            return null;
        }
        Class<?> defaultClassNameByAnnonation = getDefaultClassNameByAnnonation(str, relevantMethod);
        return defaultClassNameByAnnonation != null ? defaultClassNameByAnnonation : getByConcreteType(str, relevantMethod);
    }

    public Class<?> getDefaultClassNameByAnnonation(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) getAnnotation(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    public Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i10 = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i10 >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i10].getName())) {
                return this.methodDescriptors[i10].getMethod();
            }
            i10++;
        }
    }

    public Object getObj() {
        return this.obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    public PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i10 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i10 >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i10].getName())) {
                return this.propertyDescriptors[i10];
            }
            i10++;
        }
    }

    public Method getRelevantMethod(String str, AggregationType aggregationType) {
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(strCapitalizeFirstLetter);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(strCapitalizeFirstLetter);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    public void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e10) {
            StringBuilder sbA = defpackage.a.a("Failed to introspect ");
            sbA.append(this.obj);
            sbA.append(": ");
            sbA.append(e10.getMessage());
            addError(sbA.toString());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    public void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.obj, obj);
        } catch (Exception e10) {
            StringBuilder sbA = defpackage.a.a("Could not invoke method ");
            sbA.append(method.getName());
            sbA.append(" in class ");
            sbA.append(this.obj.getClass().getName());
            sbA.append(" with parameter of type ");
            sbA.append(cls.getName());
            addError(sbA.toString(), e10);
        }
    }

    public void setComplexProperty(String str, Object obj) {
        StringBuilder sbA;
        Class<?> cls;
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            sbA = c.a("Could not find PropertyDescriptor for [", str, "] in ");
            cls = this.objClass;
        } else {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                if (isSanityCheckSuccessful(str, writeMethod, writeMethod.getParameterTypes(), obj)) {
                    try {
                        invokeMethodWithSingleParameterOnThisObject(writeMethod, obj);
                        return;
                    } catch (Exception e10) {
                        StringBuilder sbA2 = defpackage.a.a("Could not set component ");
                        sbA2.append(this.obj);
                        sbA2.append(" for parent component ");
                        sbA2.append(this.obj);
                        addError(sbA2.toString(), e10);
                        return;
                    }
                }
                return;
            }
            sbA = c.a("Not setter method for property [", str, "] in ");
            cls = this.obj.getClass();
        }
        sbA.append(cls.getName());
        addWarn(sbA.toString());
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException(j.a("No setter for property [", str, "]."));
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object objConvertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (objConvertArg != null) {
                try {
                    writeMethod.invoke(this.obj, objConvertArg);
                } catch (Exception e10) {
                    throw new PropertySetterException(e10);
                }
            } else {
                StringBuilder sbA = defpackage.a.a("Conversion to type [");
                sbA.append(parameterTypes[0]);
                sbA.append("] failed.");
                throw new PropertySetterException(sbA.toString());
            }
        } catch (Throwable th) {
            StringBuilder sbA2 = defpackage.a.a("Conversion to type [");
            sbA2.append(parameterTypes[0]);
            sbA2.append("] failed. ");
            throw new PropertySetterException(sbA2.toString(), th);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strDecapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(strDecapitalize);
        if (propertyDescriptor == null) {
            StringBuilder sbA = c.a("No such property [", strDecapitalize, "] in ");
            sbA.append(this.objClass.getName());
            sbA.append(".");
            addWarn(sbA.toString());
            return;
        }
        try {
            setProperty(propertyDescriptor, strDecapitalize, str2);
        } catch (PropertySetterException e10) {
            addWarn(q.a("Failed to set property [", strDecapitalize, "] to value \"", str2, "\". "), e10);
        }
    }
}

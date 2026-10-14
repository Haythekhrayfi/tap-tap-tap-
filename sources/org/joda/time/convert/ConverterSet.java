package org.joda.time.convert;

import defpackage.a;

/* JADX INFO: loaded from: classes3.dex */
class ConverterSet {
    private final Converter[] iConverters;
    private Entry[] iSelectEntries = new Entry[16];

    public static class Entry {
        public final Converter iConverter;
        public final Class<?> iType;

        public Entry(Class<?> cls, Converter converter) {
            this.iType = cls;
            this.iConverter = converter;
        }
    }

    public ConverterSet(Converter[] converterArr) {
        this.iConverters = converterArr;
    }

    private static Converter selectSlow(ConverterSet converterSet, Class<?> cls) {
        Converter[] converterArr = converterSet.iConverters;
        int length = converterArr.length;
        int length2 = length;
        while (true) {
            length--;
            if (length < 0) {
                if (cls == null || length2 == 0) {
                    return null;
                }
                if (length2 == 1) {
                    return converterArr[0];
                }
                int i10 = length2;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    Class<?> supportedType = converterArr[length2].getSupportedType();
                    int length3 = i10;
                    while (true) {
                        i10--;
                        if (i10 >= 0) {
                            if (i10 != length2 && converterArr[i10].getSupportedType().isAssignableFrom(supportedType)) {
                                converterSet = converterSet.remove(i10, (Converter[]) null);
                                converterArr = converterSet.iConverters;
                                length3 = converterArr.length;
                                length2 = length3 - 1;
                            }
                        }
                    }
                    i10 = length3;
                }
                if (i10 == 1) {
                    return converterArr[0];
                }
                StringBuilder sbA = a.a("Unable to find best converter for type \"");
                sbA.append(cls.getName());
                sbA.append("\" from remaining set: ");
                for (int i11 = 0; i11 < i10; i11++) {
                    Converter converter = converterArr[i11];
                    Class<?> supportedType2 = converter.getSupportedType();
                    sbA.append(converter.getClass().getName());
                    sbA.append('[');
                    sbA.append(supportedType2 == null ? null : supportedType2.getName());
                    sbA.append("], ");
                }
                throw new IllegalStateException(sbA.toString());
            }
            Converter converter2 = converterArr[length];
            Class<?> supportedType3 = converter2.getSupportedType();
            if (supportedType3 == cls) {
                return converter2;
            }
            if (supportedType3 == null || (cls != null && !supportedType3.isAssignableFrom(cls))) {
                converterSet = converterSet.remove(length, (Converter[]) null);
                converterArr = converterSet.iConverters;
                length2 = converterArr.length;
            }
        }
    }

    public ConverterSet add(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Converter converter2 = converterArr2[i10];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                }
                return this;
            }
            if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 != i10) {
                        converterArr3[i11] = converterArr2[i11];
                    } else {
                        converterArr3[i11] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new ConverterSet(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new ConverterSet(converterArr4);
    }

    public void copyInto(Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        System.arraycopy(converterArr2, 0, converterArr, 0, converterArr2.length);
    }

    public ConverterSet remove(int i10, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        if (i10 >= length) {
            throw new IndexOutOfBoundsException();
        }
        if (converterArr != null) {
            converterArr[0] = converterArr2[i10];
        }
        Converter[] converterArr3 = new Converter[length - 1];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 != i10) {
                converterArr3[i11] = converterArr2[i12];
                i11++;
            }
        }
        return new ConverterSet(converterArr3);
    }

    public ConverterSet remove(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (converter.equals(converterArr2[i10])) {
                return remove(i10, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x000e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.joda.time.convert.Converter select(java.lang.Class<?> r10) throws java.lang.IllegalStateException {
        /*
            r9 = this;
            org.joda.time.convert.ConverterSet$Entry[] r0 = r9.iSelectEntries
            int r1 = r0.length
            r2 = 0
            if (r10 != 0) goto L7
            goto L1d
        L7:
            int r3 = r10.hashCode()
            int r4 = r1 + (-1)
            r3 = r3 & r4
        Le:
            r4 = r0[r3]
            if (r4 == 0) goto L1f
            java.lang.Class<?> r5 = r4.iType
            if (r5 != r10) goto L19
            org.joda.time.convert.Converter r10 = r4.iConverter
            return r10
        L19:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L1d:
            r3 = r2
            goto Le
        L1f:
            org.joda.time.convert.Converter r4 = selectSlow(r9, r10)
            org.joda.time.convert.ConverterSet$Entry r5 = new org.joda.time.convert.ConverterSet$Entry
            r5.<init>(r10, r4)
            java.lang.Object r10 = r0.clone()
            org.joda.time.convert.ConverterSet$Entry[] r10 = (org.joda.time.convert.ConverterSet.Entry[]) r10
            r10[r3] = r5
            r0 = r2
        L31:
            if (r0 >= r1) goto L3d
            r3 = r10[r0]
            if (r3 != 0) goto L3a
            r9.iSelectEntries = r10
            return r4
        L3a:
            int r0 = r0 + 1
            goto L31
        L3d:
            int r0 = r1 << 1
            org.joda.time.convert.ConverterSet$Entry[] r3 = new org.joda.time.convert.ConverterSet.Entry[r0]
            r5 = r2
        L42:
            if (r5 >= r1) goto L61
            r6 = r10[r5]
            java.lang.Class<?> r7 = r6.iType
            if (r7 != 0) goto L4b
            goto L5a
        L4b:
            int r7 = r7.hashCode()
            int r8 = r0 + (-1)
            r7 = r7 & r8
        L52:
            r8 = r3[r7]
            if (r8 == 0) goto L5c
            int r7 = r7 + 1
            if (r7 < r0) goto L52
        L5a:
            r7 = r2
            goto L52
        L5c:
            r3[r7] = r6
            int r5 = r5 + 1
            goto L42
        L61:
            r9.iSelectEntries = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.ConverterSet.select(java.lang.Class):org.joda.time.convert.Converter");
    }

    public int size() {
        return this.iConverters.length;
    }
}

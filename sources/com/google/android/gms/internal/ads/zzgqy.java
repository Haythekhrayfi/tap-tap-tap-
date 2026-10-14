package com.google.android.gms.internal.ads;

import android.support.v4.media.c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqy {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzgqw zzgqwVar, String str) {
        StringBuilder sbA = c.a("# ", str);
        zzd(zzgqwVar, sbA, 0);
        return sbA.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgse.zza(zzgoe.zzw((String) obj)));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzgoe) {
            sb2.append(": \"");
            sb2.append(zzgse.zza((zzgoe) obj));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzgpm) {
            sb2.append(" {");
            zzd((zzgpm) obj, sb2, i10 + 2);
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        zzb(sb2, i12, Action.KEY_ATTRIBUTE, entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        zzc(i10, sb2);
        sb2.append("}");
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f4  */
    private static void zzd(zzgqw zzgqwVar, StringBuilder sb2, int i10) {
        int i11;
        Object obj;
        Method method;
        String strSubstring;
        Object objZzaQ;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgqwVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring2 = ((String) entry.getKey()).substring(i11);
            if (!strSubstring2.endsWith("List") || strSubstring2.endsWith("OrBuilderList") || strSubstring2.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (strSubstring2.endsWith("Map") && !strSubstring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    strSubstring = strSubstring2.substring(0, strSubstring2.length() - 3);
                    objZzaQ = zzgpm.zzaQ(method, zzgqwVar, new Object[0]);
                } else if (hashSet.contains("set".concat(strSubstring2)) && (!strSubstring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) map.get("has".concat(strSubstring2));
                    if (method4 != null) {
                        Object objZzaQ2 = zzgpm.zzaQ(method4, zzgqwVar, new Object[0]);
                        if (method5 == null) {
                            if (objZzaQ2 instanceof Boolean) {
                                if (((Boolean) objZzaQ2).booleanValue()) {
                                    zzb(sb2, i10, strSubstring2, objZzaQ2);
                                }
                            } else if (objZzaQ2 instanceof Integer) {
                                if (((Integer) objZzaQ2).intValue() != 0) {
                                    zzb(sb2, i10, strSubstring2, objZzaQ2);
                                }
                            } else if (objZzaQ2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objZzaQ2).floatValue()) != 0) {
                                    zzb(sb2, i10, strSubstring2, objZzaQ2);
                                }
                            } else if (!(objZzaQ2 instanceof Double)) {
                                if (objZzaQ2 instanceof String) {
                                    obj = "";
                                } else if (objZzaQ2 instanceof zzgoe) {
                                    obj = zzgoe.zzb;
                                } else if (objZzaQ2 instanceof zzgqw) {
                                    if (objZzaQ2 != ((zzgqw) objZzaQ2).zzbf()) {
                                        zzb(sb2, i10, strSubstring2, objZzaQ2);
                                    }
                                } else if (!(objZzaQ2 instanceof Enum) || ((Enum) objZzaQ2).ordinal() != 0) {
                                    zzb(sb2, i10, strSubstring2, objZzaQ2);
                                }
                                if (!objZzaQ2.equals(obj)) {
                                    zzb(sb2, i10, strSubstring2, objZzaQ2);
                                }
                            } else if (Double.doubleToRawLongBits(((Double) objZzaQ2).doubleValue()) != 0) {
                                zzb(sb2, i10, strSubstring2, objZzaQ2);
                            }
                        } else if (((Boolean) zzgpm.zzaQ(method5, zzgqwVar, new Object[0])).booleanValue()) {
                            zzb(sb2, i10, strSubstring2, objZzaQ2);
                        }
                    }
                }
                i11 = 3;
            } else {
                strSubstring = strSubstring2.substring(0, strSubstring2.length() - 4);
                objZzaQ = zzgpm.zzaQ(method2, zzgqwVar, new Object[0]);
            }
            zzb(sb2, i10, strSubstring, objZzaQ);
            i11 = 3;
        }
        if (zzgqwVar instanceof zzgpj) {
            throw null;
        }
        zzgsh zzgshVar = ((zzgpm) zzgqwVar).zzc;
        if (zzgshVar != null) {
            zzgshVar.zzi(sb2, i10);
        }
    }
}

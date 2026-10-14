package com.google.android.gms.internal.measurement;

import android.support.v4.media.c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzln {
    public static String zza(zzll zzllVar, String str) {
        StringBuilder sbA = c.a("# ", str);
        zzd(zzllVar, sbA, 0);
        return sbA.toString();
    }

    public static final void zzb(StringBuilder sb2, int i10, String str, Object obj) {
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
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzml.zza(zzjd.zzm((String) obj)));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzjd) {
            sb2.append(": \"");
            sb2.append(zzml.zza((zzjd) obj));
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzke) {
            sb2.append(" {");
            zzd((zzke) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
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
        int i13 = i10 + 2;
        zzb(sb2, i13, Action.KEY_ATTRIBUTE, entry.getKey());
        zzb(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzll zzllVar, StringBuilder sb2, int i10) {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzllVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzc(strConcat), zzke.zzbH(method2, zzllVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(strConcat2), zzke.zzbH(method3, zzllVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbH = zzke.zzbH(method4, zzllVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbH instanceof Boolean) {
                            if (((Boolean) objZzbH).booleanValue()) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbH);
                            }
                        } else if (objZzbH instanceof Integer) {
                            if (((Integer) objZzbH).intValue() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbH);
                            }
                        } else if (objZzbH instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbH).floatValue()) != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbH);
                            }
                        } else if (!(objZzbH instanceof Double)) {
                            if (objZzbH instanceof String) {
                                obj = "";
                            } else if (objZzbH instanceof zzjd) {
                                obj = zzjd.zzb;
                            } else if (objZzbH instanceof zzll) {
                                if (objZzbH != ((zzll) objZzbH).zzbO()) {
                                    zzb(sb2, i10, zzc(strConcat3), objZzbH);
                                }
                            } else if (!(objZzbH instanceof Enum) || ((Enum) objZzbH).ordinal() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbH);
                            }
                            if (!objZzbH.equals(obj)) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbH);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbH).doubleValue()) != 0) {
                            zzb(sb2, i10, zzc(strConcat3), objZzbH);
                        }
                    } else if (((Boolean) zzke.zzbH(method5, zzllVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(strConcat3), objZzbH);
                    }
                }
            }
        }
        if (zzllVar instanceof zzkb) {
            throw null;
        }
        zzmo zzmoVar = ((zzke) zzllVar).zzc;
        if (zzmoVar != null) {
            zzmoVar.zzg(sb2, i10);
        }
    }
}

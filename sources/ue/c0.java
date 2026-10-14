package ue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0<T> {
    public static <T> c0<T> b(b0 b0Var, Method method) {
        Type genericReturnType;
        boolean z10;
        int i10;
        int i11;
        String str;
        Type type;
        ParameterHandler<?> parameterHandler;
        int i12;
        Type type2;
        String str2;
        ParameterHandler<?> gVar;
        ParameterHandler<?> oVar;
        ParameterHandler<?> sVar;
        ParameterHandler<?> cVar;
        String strValue;
        String str3;
        String strValue2;
        String str4;
        String strValue3;
        y.a aVar = new y.a(b0Var, method);
        Annotation[] annotationArr = aVar.f36522c;
        int length = annotationArr.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String str5 = "HEAD";
            int i15 = 1;
            if (i14 >= length) {
                if (aVar.f36533n == null) {
                    throw f0.j(aVar.f36521b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.f36534o) {
                    if (aVar.f36536q) {
                        throw f0.j(aVar.f36521b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.f36535p) {
                        throw f0.j(aVar.f36521b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length2 = aVar.f36523d.length;
                aVar.f36541v = new t[length2];
                int i16 = length2 - 1;
                int i17 = 0;
                while (i13 < length2) {
                    ParameterHandler<?>[] parameterHandlerArr = aVar.f36541v;
                    Type type3 = aVar.f36524e[i13];
                    Annotation[] annotationArr2 = aVar.f36523d[i13];
                    if (i13 != i16) {
                        i15 = i17;
                    }
                    if (annotationArr2 != null) {
                        int length3 = annotationArr2.length;
                        parameterHandler = null;
                        while (i17 < length3) {
                            Annotation annotation = annotationArr2[i17];
                            int i18 = length2;
                            int i19 = i16;
                            if (annotation instanceof we.y) {
                                aVar.c(i13, type3);
                                if (aVar.f36532m) {
                                    throw f0.l(aVar.f36521b, i13, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.f36528i) {
                                    throw f0.l(aVar.f36521b, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.f36529j) {
                                    throw f0.l(aVar.f36521b, i13, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.f36530k) {
                                    throw f0.l(aVar.f36521b, i13, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.f36531l) {
                                    throw f0.l(aVar.f36521b, i13, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.f36537r != null) {
                                    throw f0.l(aVar.f36521b, i13, "@Url cannot be used with @%s URL", aVar.f36533n);
                                }
                                aVar.f36532m = true;
                                if (type3 != HttpUrl.class && type3 != String.class && type3 != URI.class && (!(type3 instanceof Class) || !"android.net.Uri".equals(((Class) type3).getName()))) {
                                    throw f0.l(aVar.f36521b, i13, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                gVar = new t.n(aVar.f36521b, i13);
                                str2 = str5;
                                i12 = length3;
                                type2 = type3;
                            } else {
                                i12 = length3;
                                if (annotation instanceof we.s) {
                                    aVar.c(i13, type3);
                                    if (aVar.f36529j) {
                                        throw f0.l(aVar.f36521b, i13, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.f36530k) {
                                        throw f0.l(aVar.f36521b, i13, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.f36531l) {
                                        throw f0.l(aVar.f36521b, i13, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.f36532m) {
                                        throw f0.l(aVar.f36521b, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.f36537r == null) {
                                        throw f0.l(aVar.f36521b, i13, "@Path can only be used with relative url on @%s", aVar.f36533n);
                                    }
                                    aVar.f36528i = true;
                                    we.s sVar2 = (we.s) annotation;
                                    String strValue4 = sVar2.value();
                                    if (!y.a.f36519y.matcher(strValue4).matches()) {
                                        throw f0.l(aVar.f36521b, i13, "@Path parameter name must match %s. Found: %s", y.a.f36518x.pattern(), strValue4);
                                    }
                                    if (!aVar.f36540u.contains(strValue4)) {
                                        throw f0.l(aVar.f36521b, i13, "URL \"%s\" does not contain \"{%s}\".", aVar.f36537r, strValue4);
                                    }
                                    aVar.f36520a.e(type3, annotationArr2);
                                    type2 = type3;
                                    annotationArr2 = annotationArr2;
                                    gVar = new t.i<>(aVar.f36521b, i13, strValue4, a.d.f36371a, sVar2.encoded());
                                } else {
                                    type2 = type3;
                                    if (annotation instanceof we.t) {
                                        aVar.c(i13, type2);
                                        we.t tVar = (we.t) annotation;
                                        String strValue5 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        Class<?> clsF = f0.f(type2);
                                        aVar.f36529j = true;
                                        if (Iterable.class.isAssignableFrom(clsF)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, w.a(clsF, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f36520a.e(f0.e(0, (ParameterizedType) type2), annotationArr2);
                                            gVar = new r(new t.j(strValue5, a.d.f36371a, zEncoded));
                                        } else if (clsF.isArray()) {
                                            aVar.f36520a.e(y.a.a(clsF.getComponentType()), annotationArr2);
                                            gVar = new s(new t.j(strValue5, a.d.f36371a, zEncoded));
                                        } else {
                                            aVar.f36520a.e(type2, annotationArr2);
                                            gVar = new t.j<>(strValue5, a.d.f36371a, zEncoded);
                                        }
                                    } else if (annotation instanceof we.v) {
                                        aVar.c(i13, type2);
                                        boolean zEncoded2 = ((we.v) annotation).encoded();
                                        Class<?> clsF2 = f0.f(type2);
                                        aVar.f36530k = true;
                                        if (Iterable.class.isAssignableFrom(clsF2)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, w.a(clsF2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f36520a.e(f0.e(0, (ParameterizedType) type2), annotationArr2);
                                            gVar = new r(new t.l(a.d.f36371a, zEncoded2));
                                        } else if (clsF2.isArray()) {
                                            aVar.f36520a.e(y.a.a(clsF2.getComponentType()), annotationArr2);
                                            gVar = new s(new t.l(a.d.f36371a, zEncoded2));
                                        } else {
                                            aVar.f36520a.e(type2, annotationArr2);
                                            str2 = str5;
                                            gVar = new t.l<>(a.d.f36371a, zEncoded2);
                                        }
                                    } else if (annotation instanceof we.u) {
                                        aVar.c(i13, type2);
                                        Class<?> clsF3 = f0.f(type2);
                                        aVar.f36531l = true;
                                        if (!Map.class.isAssignableFrom(clsF3)) {
                                            throw f0.l(aVar.f36521b, i13, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type typeG = f0.g(type2, clsF3, Map.class);
                                        if (!(typeG instanceof ParameterizedType)) {
                                            throw f0.l(aVar.f36521b, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType = (ParameterizedType) typeG;
                                        Type typeE = f0.e(0, parameterizedType);
                                        if (String.class != typeE) {
                                            throw f0.l(aVar.f36521b, i13, x.a("@QueryMap keys must be of type String: ", typeE), new Object[0]);
                                        }
                                        aVar.f36520a.e(f0.e(1, parameterizedType), annotationArr2);
                                        gVar = new t.k<>(aVar.f36521b, i13, a.d.f36371a, ((we.u) annotation).encoded());
                                    } else if (annotation instanceof we.i) {
                                        aVar.c(i13, type2);
                                        String strValue6 = ((we.i) annotation).value();
                                        Class<?> clsF4 = f0.f(type2);
                                        if (Iterable.class.isAssignableFrom(clsF4)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, w.a(clsF4, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f36520a.e(f0.e(0, (ParameterizedType) type2), annotationArr2);
                                            gVar = new r(new t.d(strValue6, a.d.f36371a));
                                        } else if (clsF4.isArray()) {
                                            aVar.f36520a.e(y.a.a(clsF4.getComponentType()), annotationArr2);
                                            gVar = new s(new t.d(strValue6, a.d.f36371a));
                                        } else {
                                            aVar.f36520a.e(type2, annotationArr2);
                                            str2 = str5;
                                            gVar = new t.d<>(strValue6, a.d.f36371a);
                                        }
                                    } else if (annotation instanceof we.j) {
                                        if (type2 == Headers.class) {
                                            cVar = new t.f(aVar.f36521b, i13);
                                            gVar = cVar;
                                        } else {
                                            aVar.c(i13, type2);
                                            Class<?> clsF5 = f0.f(type2);
                                            if (!Map.class.isAssignableFrom(clsF5)) {
                                                throw f0.l(aVar.f36521b, i13, "@HeaderMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeG2 = f0.g(type2, clsF5, Map.class);
                                            if (!(typeG2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType2 = (ParameterizedType) typeG2;
                                            Type typeE2 = f0.e(0, parameterizedType2);
                                            if (String.class != typeE2) {
                                                throw f0.l(aVar.f36521b, i13, x.a("@HeaderMap keys must be of type String: ", typeE2), new Object[0]);
                                            }
                                            aVar.f36520a.e(f0.e(1, parameterizedType2), annotationArr2);
                                            gVar = new t.e<>(aVar.f36521b, i13, a.d.f36371a);
                                        }
                                    } else if (annotation instanceof we.c) {
                                        aVar.c(i13, type2);
                                        if (!aVar.f36535p) {
                                            throw f0.l(aVar.f36521b, i13, "@Field parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        we.c cVar2 = (we.c) annotation;
                                        String strValue7 = cVar2.value();
                                        boolean zEncoded3 = cVar2.encoded();
                                        aVar.f36525f = true;
                                        Class<?> clsF6 = f0.f(type2);
                                        if (Iterable.class.isAssignableFrom(clsF6)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, w.a(clsF6, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f36520a.e(f0.e(0, (ParameterizedType) type2), annotationArr2);
                                            cVar = new r(new t.b(strValue7, a.d.f36371a, zEncoded3));
                                        } else if (clsF6.isArray()) {
                                            aVar.f36520a.e(y.a.a(clsF6.getComponentType()), annotationArr2);
                                            cVar = new s(new t.b(strValue7, a.d.f36371a, zEncoded3));
                                        } else {
                                            aVar.f36520a.e(type2, annotationArr2);
                                            gVar = new t.b<>(strValue7, a.d.f36371a, zEncoded3);
                                        }
                                        gVar = cVar;
                                    } else if (annotation instanceof we.d) {
                                        aVar.c(i13, type2);
                                        if (!aVar.f36535p) {
                                            throw f0.l(aVar.f36521b, i13, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        Class<?> clsF7 = f0.f(type2);
                                        if (!Map.class.isAssignableFrom(clsF7)) {
                                            throw f0.l(aVar.f36521b, i13, "@FieldMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type typeG3 = f0.g(type2, clsF7, Map.class);
                                        if (!(typeG3 instanceof ParameterizedType)) {
                                            throw f0.l(aVar.f36521b, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType3 = (ParameterizedType) typeG3;
                                        Type typeE3 = f0.e(0, parameterizedType3);
                                        if (String.class != typeE3) {
                                            throw f0.l(aVar.f36521b, i13, x.a("@FieldMap keys must be of type String: ", typeE3), new Object[0]);
                                        }
                                        aVar.f36520a.e(f0.e(1, parameterizedType3), annotationArr2);
                                        a.d dVar = a.d.f36371a;
                                        aVar.f36525f = true;
                                        cVar = new t.c<>(aVar.f36521b, i13, dVar, ((we.d) annotation).encoded());
                                        gVar = cVar;
                                    } else if (annotation instanceof we.q) {
                                        aVar.c(i13, type2);
                                        if (!aVar.f36536q) {
                                            throw f0.l(aVar.f36521b, i13, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        we.q qVar = (we.q) annotation;
                                        aVar.f36526g = true;
                                        String strValue8 = qVar.value();
                                        Class<?> clsF8 = f0.f(type2);
                                        if (!strValue8.isEmpty()) {
                                            str2 = str5;
                                            Headers headersOf = Headers.of("Content-Disposition", androidx.activity.j.a("form-data; name=\"", strValue8, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                            if (Iterable.class.isAssignableFrom(clsF8)) {
                                                if (!(type2 instanceof ParameterizedType)) {
                                                    throw f0.l(aVar.f36521b, i13, w.a(clsF8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                                Type typeE4 = f0.e(0, (ParameterizedType) type2);
                                                if (MultipartBody.Part.class.isAssignableFrom(f0.f(typeE4))) {
                                                    throw f0.l(aVar.f36521b, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                sVar = new r(new t.g(aVar.f36521b, i13, headersOf, aVar.f36520a.c(typeE4, annotationArr2, aVar.f36522c)));
                                            } else if (clsF8.isArray()) {
                                                Class<?> clsA = y.a.a(clsF8.getComponentType());
                                                if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                    throw f0.l(aVar.f36521b, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                sVar = new s(new t.g(aVar.f36521b, i13, headersOf, aVar.f36520a.c(clsA, annotationArr2, aVar.f36522c)));
                                            } else {
                                                if (MultipartBody.Part.class.isAssignableFrom(clsF8)) {
                                                    throw f0.l(aVar.f36521b, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                gVar = new t.g<>(aVar.f36521b, i13, headersOf, aVar.f36520a.c(type2, annotationArr2, aVar.f36522c));
                                            }
                                            gVar = sVar;
                                        } else if (Iterable.class.isAssignableFrom(clsF8)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, w.a(clsF8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            if (!MultipartBody.Part.class.isAssignableFrom(f0.f(f0.e(0, (ParameterizedType) type2)))) {
                                                throw f0.l(aVar.f36521b, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            gVar = new r(t.m.f36484a);
                                        } else if (clsF8.isArray()) {
                                            if (!MultipartBody.Part.class.isAssignableFrom(clsF8.getComponentType())) {
                                                throw f0.l(aVar.f36521b, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            gVar = new s(t.m.f36484a);
                                        } else {
                                            if (!MultipartBody.Part.class.isAssignableFrom(clsF8)) {
                                                throw f0.l(aVar.f36521b, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            gVar = t.m.f36484a;
                                        }
                                    } else {
                                        str2 = str5;
                                        if (annotation instanceof we.r) {
                                            aVar.c(i13, type2);
                                            if (!aVar.f36536q) {
                                                throw f0.l(aVar.f36521b, i13, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            aVar.f36526g = true;
                                            Class<?> clsF9 = f0.f(type2);
                                            if (!Map.class.isAssignableFrom(clsF9)) {
                                                throw f0.l(aVar.f36521b, i13, "@PartMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeG4 = f0.g(type2, clsF9, Map.class);
                                            if (!(typeG4 instanceof ParameterizedType)) {
                                                throw f0.l(aVar.f36521b, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType4 = (ParameterizedType) typeG4;
                                            Type typeE5 = f0.e(0, parameterizedType4);
                                            if (String.class != typeE5) {
                                                throw f0.l(aVar.f36521b, i13, x.a("@PartMap keys must be of type String: ", typeE5), new Object[0]);
                                            }
                                            Type typeE6 = f0.e(1, parameterizedType4);
                                            if (MultipartBody.Part.class.isAssignableFrom(f0.f(typeE6))) {
                                                throw f0.l(aVar.f36521b, i13, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                            }
                                            oVar = new t.h<>(aVar.f36521b, i13, aVar.f36520a.c(typeE6, annotationArr2, aVar.f36522c), ((we.r) annotation).encoding());
                                        } else if (annotation instanceof we.a) {
                                            aVar.c(i13, type2);
                                            if (aVar.f36535p || aVar.f36536q) {
                                                throw f0.l(aVar.f36521b, i13, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                            }
                                            if (aVar.f36527h) {
                                                throw f0.l(aVar.f36521b, i13, "Multiple @Body method annotations found.", new Object[0]);
                                            }
                                            try {
                                                f<T, RequestBody> fVarC = aVar.f36520a.c(type2, annotationArr2, aVar.f36522c);
                                                aVar.f36527h = true;
                                                oVar = new t.a<>(aVar.f36521b, i13, fVarC);
                                            } catch (RuntimeException e10) {
                                                throw f0.m(aVar.f36521b, e10, i13, "Unable to create @Body converter for %s", type2);
                                            }
                                        } else if (annotation instanceof we.x) {
                                            aVar.c(i13, type2);
                                            Class<?> clsF10 = f0.f(type2);
                                            for (int i20 = i13 - 1; i20 >= 0; i20--) {
                                                t.o oVar2 = aVar.f36541v[i20];
                                                if ((oVar2 instanceof t.o) && oVar2.f36487a.equals(clsF10)) {
                                                    Method method2 = aVar.f36521b;
                                                    StringBuilder sbA = defpackage.a.a("@Tag type ");
                                                    sbA.append(clsF10.getName());
                                                    sbA.append(" is duplicate of parameter #");
                                                    sbA.append(i20 + 1);
                                                    sbA.append(" and would always overwrite its value.");
                                                    throw f0.l(method2, i13, sbA.toString(), new Object[0]);
                                                }
                                            }
                                            oVar = new t.o<>(clsF10);
                                        } else {
                                            gVar = null;
                                        }
                                        gVar = oVar;
                                    }
                                }
                                str2 = str5;
                            }
                            if (gVar != null) {
                                if (parameterHandler != null) {
                                    throw f0.l(aVar.f36521b, i13, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                parameterHandler = gVar;
                            }
                            i17++;
                            type3 = type2;
                            length2 = i18;
                            i16 = i19;
                            length3 = i12;
                            str5 = str2;
                        }
                        i10 = length2;
                        i11 = i16;
                        str = str5;
                        type = type3;
                    } else {
                        i10 = length2;
                        i11 = i16;
                        str = str5;
                        type = type3;
                        parameterHandler = null;
                    }
                    if (parameterHandler == null) {
                        if (i15 != 0) {
                            try {
                                if (f0.f(type) == mc.d.class) {
                                    aVar.f36542w = true;
                                    parameterHandler = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw f0.l(aVar.f36521b, i13, "No Retrofit annotation found.", new Object[0]);
                    }
                    parameterHandlerArr[i13] = parameterHandler;
                    i13++;
                    i17 = 0;
                    i15 = 1;
                    length2 = i10;
                    i16 = i11;
                    str5 = str;
                }
                String str6 = str5;
                if (aVar.f36537r == null && !aVar.f36532m) {
                    throw f0.j(aVar.f36521b, "Missing either @%s URL or @Url parameter.", aVar.f36533n);
                }
                boolean z11 = aVar.f36535p;
                if (!z11 && !aVar.f36536q && !aVar.f36534o && aVar.f36527h) {
                    throw f0.j(aVar.f36521b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !aVar.f36525f) {
                    throw f0.j(aVar.f36521b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.f36536q && !aVar.f36526g) {
                    throw f0.j(aVar.f36521b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                y yVar = new y(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (f0.h(genericReturnType2)) {
                    throw f0.j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw f0.j(method, "Service methods cannot return void.", new Object[0]);
                }
                boolean z12 = yVar.f36517k;
                Annotation[] annotations = method.getAnnotations();
                if (z12) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeE7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeE7 instanceof WildcardType) {
                        typeE7 = ((WildcardType) typeE7).getLowerBounds()[0];
                    }
                    if (f0.f(typeE7) == z.class && (typeE7 instanceof ParameterizedType)) {
                        typeE7 = f0.e(0, (ParameterizedType) typeE7);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    genericReturnType = new f0.b(null, b.class, typeE7);
                    if (!f0.i(annotations, d0.class)) {
                        Annotation[] annotationArr3 = new Annotation[annotations.length + 1];
                        annotationArr3[0] = e0.f36396a;
                        System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                        annotations = annotationArr3;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z10 = false;
                }
                try {
                    c<?, ?> cVarA = b0Var.a(genericReturnType, annotations);
                    Type typeB = cVarA.b();
                    if (typeB == Response.class) {
                        StringBuilder sbA2 = defpackage.a.a("'");
                        sbA2.append(f0.f(typeB).getName());
                        sbA2.append("' is not a valid response body type. Did you mean ResponseBody?");
                        throw f0.j(method, sbA2.toString(), new Object[0]);
                    }
                    if (typeB == z.class) {
                        throw f0.j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (yVar.f36509c.equals(str6) && !Void.class.equals(typeB)) {
                        throw f0.j(method, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        f<ResponseBody, T> fVarD = b0Var.d(typeB, method.getAnnotations());
                        Call.Factory factory = b0Var.f36379b;
                        if (z12) {
                            return z10 ? new i.c(yVar, factory, fVarD, cVarA) : new i.b(yVar, factory, fVarD, cVarA, false);
                        }
                        return new i.a(yVar, factory, fVarD, cVarA);
                    } catch (RuntimeException e11) {
                        throw f0.k(method, e11, "Unable to create converter for %s", typeB);
                    }
                } catch (RuntimeException e12) {
                    throw f0.k(method, e12, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i14];
            if (annotation2 instanceof we.b) {
                strValue = ((we.b) annotation2).value();
                str3 = "DELETE";
            } else if (annotation2 instanceof we.f) {
                strValue = ((we.f) annotation2).value();
                str3 = "GET";
            } else {
                if (annotation2 instanceof we.g) {
                    strValue3 = ((we.g) annotation2).value();
                    aVar.b(str5, strValue3, false);
                } else {
                    if (annotation2 instanceof we.n) {
                        strValue2 = ((we.n) annotation2).value();
                        str4 = "PATCH";
                    } else if (annotation2 instanceof we.o) {
                        strValue2 = ((we.o) annotation2).value();
                        str4 = "POST";
                    } else if (annotation2 instanceof we.p) {
                        strValue2 = ((we.p) annotation2).value();
                        str4 = "PUT";
                    } else if (annotation2 instanceof we.m) {
                        strValue = ((we.m) annotation2).value();
                        str3 = "OPTIONS";
                    } else if (annotation2 instanceof we.h) {
                        we.h hVar = (we.h) annotation2;
                        aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
                    } else if (annotation2 instanceof we.k) {
                        String[] strArrValue = ((we.k) annotation2).value();
                        if (strArrValue.length == 0) {
                            throw f0.j(aVar.f36521b, "@Headers annotation is empty.", new Object[0]);
                        }
                        Headers.Builder builder = new Headers.Builder();
                        for (String str7 : strArrValue) {
                            int iIndexOf = str7.indexOf(58);
                            if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str7.length() - 1) {
                                throw f0.j(aVar.f36521b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str7);
                            }
                            String strSubstring = str7.substring(0, iIndexOf);
                            String strTrim = str7.substring(iIndexOf + 1).trim();
                            if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                                try {
                                    aVar.f36539t = MediaType.get(strTrim);
                                } catch (IllegalArgumentException e13) {
                                    throw f0.k(aVar.f36521b, e13, "Malformed content type: %s", strTrim);
                                }
                            } else {
                                builder.add(strSubstring, strTrim);
                            }
                        }
                        aVar.f36538s = builder.build();
                    } else if (annotation2 instanceof we.l) {
                        if (aVar.f36535p) {
                            throw f0.j(aVar.f36521b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        aVar.f36536q = true;
                    } else if (!(annotation2 instanceof we.e)) {
                        continue;
                    } else {
                        if (aVar.f36536q) {
                            throw f0.j(aVar.f36521b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        aVar.f36535p = true;
                    }
                    aVar.b(str4, strValue2, true);
                }
                i14++;
            }
            String str8 = str3;
            strValue3 = strValue;
            str5 = str8;
            aVar.b(str5, strValue3, false);
            i14++;
        }
    }

    @Nullable
    public abstract T a(Object[] objArr);
}

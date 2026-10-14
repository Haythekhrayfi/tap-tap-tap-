package com.google.gson;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.internal.t;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultDateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Date> f12713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f12714b;

    public DefaultDateTypeAdapter(int i10, int i11) {
        this(Date.class, i10, i11);
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f12714b = arrayList;
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f12713a = cls;
            Locale locale = Locale.US;
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
            if (!Locale.getDefault().equals(locale)) {
                arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
            }
            if (com.google.gson.internal.o.f12865a >= 9) {
                arrayList.add(t.a(i10, i11));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // com.google.gson.TypeAdapter
    public Date b(o6.a aVar) throws IOException {
        Date dateB;
        Date date;
        if (aVar.V() == o6.b.NULL) {
            aVar.O();
            return null;
        }
        String strR = aVar.R();
        synchronized (this.f12714b) {
            Iterator<DateFormat> it = this.f12714b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        dateB = l6.a.b(strR, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        throw new q(strR, e10);
                    }
                }
                try {
                    dateB = it.next().parse(strR);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        Class<? extends Date> cls = this.f12713a;
        if (cls == Date.class) {
            return dateB;
        }
        if (cls == Timestamp.class) {
            date = new Timestamp(dateB.getTime());
        } else {
            if (cls != java.sql.Date.class) {
                throw new AssertionError();
            }
            date = new java.sql.Date(dateB.getTime());
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            cVar.k();
            return;
        }
        synchronized (this.f12714b) {
            cVar.K(this.f12714b.get(0).format(date2));
        }
    }

    public String toString() {
        StringBuilder sbA;
        String simpleName;
        DateFormat dateFormat = this.f12714b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sbA = defpackage.a.a("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sbA = defpackage.a.a("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        return s.a.a(sbA, simpleName, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

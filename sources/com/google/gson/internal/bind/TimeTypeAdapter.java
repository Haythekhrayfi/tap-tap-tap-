package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.q;
import com.google.gson.s;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12783b = new s() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            if (aVar.rawType == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f12784a = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.TypeAdapter
    public Time b(o6.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.V() == o6.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                return new Time(this.f12784a.parse(aVar.R()).getTime());
            } catch (ParseException e10) {
                throw new q(e10);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            cVar.K(time2 == null ? null : this.f12784a.format((Date) time2));
        }
    }
}

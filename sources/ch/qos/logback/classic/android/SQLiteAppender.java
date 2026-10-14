package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import z.c;

/* JADX INFO: loaded from: classes.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int ARG0_INDEX = 7;
    private static final int CALLER_CLASS_INDEX = 12;
    private static final int CALLER_FILENAME_INDEX = 11;
    private static final int CALLER_LINE_INDEX = 14;
    private static final int CALLER_METHOD_INDEX = 13;
    private static final short EXCEPTION_EXISTS = 2;
    private static final int FORMATTED_MESSAGE_INDEX = 2;
    private static final int LEVEL_STRING_INDEX = 4;
    private static final int LOGGER_NAME_INDEX = 3;
    private static final short PROPERTIES_EXIST = 1;
    private static final int REFERENCE_FLAG_INDEX = 6;
    private static final int THREAD_NAME_INDEX = 5;
    private static final int TIMESTMP_INDEX = 1;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private SQLiteDatabase f3680db;
    private DBNameResolver dbNameResolver;
    private String filename;
    private String insertExceptionSQL;
    private String insertPropertiesSQL;
    private String insertSQL;
    private SQLiteLogCleaner logCleaner;
    private Duration maxHistory;
    private long lastCleanupTime = 0;
    private l2.a clock = new c(1);

    public class a implements SQLiteLogCleaner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2.a f3681a;

        public a(l2.a aVar) {
            this.f3681a = aVar;
        }

        @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
        public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) {
            sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.dbNameResolver, ((c) this.f3681a).a() - duration.getMilliseconds()));
        }
    }

    private String asStringTruncatedTo254(Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string != null && string.length() > 254) {
            string = string.substring(0, 254);
        }
        return string == null ? "" : string;
    }

    private void bindCallerData(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) throws SQLException {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        bindString(sQLiteStatement, 11, stackTraceElement.getFileName());
        bindString(sQLiteStatement, 12, stackTraceElement.getClassName());
        bindString(sQLiteStatement, 13, stackTraceElement.getMethodName());
        bindString(sQLiteStatement, 14, Integer.toString(stackTraceElement.getLineNumber()));
    }

    private void bindLoggingEvent(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) throws SQLException {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, computeReferenceMask(iLoggingEvent));
    }

    private void bindLoggingEventArguments(SQLiteStatement sQLiteStatement, Object[] objArr) throws SQLException {
        int length = objArr != null ? objArr.length : 0;
        for (int i10 = 0; i10 < length && i10 < 4; i10++) {
            sQLiteStatement.bindString(i10 + 7, asStringTruncatedTo254(objArr[i10]));
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i10, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i10, str);
        }
    }

    private void clearExpiredLogs(SQLiteDatabase sQLiteDatabase) {
        if (lastCheckExpired(this.maxHistory, this.lastCleanupTime)) {
            this.lastCleanupTime = ((c) this.clock).a();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.maxHistory);
        }
    }

    private static short computeReferenceMask(ILoggingEvent iLoggingEvent) {
        short s10 = ((iLoggingEvent.getMDCPropertyMap() != null ? iLoggingEvent.getMDCPropertyMap().keySet().size() : 0) > 0 || (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null ? iLoggingEvent.getLoggerContextVO().getPropertyMap().size() : 0) > 0) ? PROPERTIES_EXIST : (short) 0;
        return iLoggingEvent.getThrowableProxy() != null ? (short) (s10 | EXCEPTION_EXISTS) : s10;
    }

    private void insertException(SQLiteStatement sQLiteStatement, String str, short s10, long j10) throws SQLException {
        sQLiteStatement.bindLong(1, j10);
        sQLiteStatement.bindLong(2, s10);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    private void insertProperties(Map<String, String> map, long j10) throws SQLException {
        if (map.size() > 0) {
            SQLiteStatement sQLiteStatementCompileStatement = this.f3680db.compileStatement(this.insertPropertiesSQL);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sQLiteStatementCompileStatement.bindLong(1, j10);
                    sQLiteStatementCompileStatement.bindString(2, entry.getKey());
                    sQLiteStatementCompileStatement.bindString(3, entry.getValue());
                    sQLiteStatementCompileStatement.executeInsert();
                }
                sQLiteStatementCompileStatement.close();
            } catch (Throwable th) {
                sQLiteStatementCompileStatement.close();
                throw th;
            }
        }
    }

    private void insertThrowable(IThrowableProxy iThrowableProxy, long j10) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.f3680db.compileStatement(this.insertExceptionSQL);
        short s10 = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb2, iThrowableProxy);
                String string = sb2.toString();
                short s11 = (short) (s10 + PROPERTIES_EXIST);
                insertException(sQLiteStatementCompileStatement, string, s10, j10);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s10 = s11;
                int i10 = 0;
                while (i10 < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb3, stackTraceElementProxyArray[i10]);
                    String string2 = sb3.toString();
                    short s12 = (short) (s10 + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, string2, s10, j10);
                    i10++;
                    s10 = s12;
                }
                if (commonFrames > 0) {
                    short s13 = (short) (s10 + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, "\t... " + commonFrames + " common frames omitted", s10, j10);
                    s10 = s13;
                }
                iThrowableProxy = iThrowableProxy.getCause();
            } catch (Throwable th) {
                sQLiteStatementCompileStatement.close();
                throw th;
            }
        }
        sQLiteStatementCompileStatement.close();
    }

    private boolean lastCheckExpired(Duration duration, long j10) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        return j10 <= 0 || ((c) this.clock).a() - j10 >= duration.getMilliseconds();
    }

    private Map<String, String> mergePropertyMaps(ILoggingEvent iLoggingEvent) {
        HashMap map = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            map.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            map.putAll(mDCPropertyMap);
        }
        return map;
    }

    private void secondarySubAppend(ILoggingEvent iLoggingEvent, long j10) throws SQLException {
        insertProperties(mergePropertyMaps(iLoggingEvent), j10);
        if (iLoggingEvent.getThrowableProxy() != null) {
            insertThrowable(iLoggingEvent.getThrowableProxy(), j10);
        }
    }

    private long subAppend(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) throws SQLException {
        bindLoggingEvent(sQLiteStatement, iLoggingEvent);
        bindLoggingEventArguments(sQLiteStatement, iLoggingEvent.getArgumentArray());
        bindCallerData(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e10) {
            addWarn("Failed to insert loggingEvent", e10);
            return -1L;
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                clearExpiredLogs(this.f3680db);
                SQLiteStatement sQLiteStatementCompileStatement = this.f3680db.compileStatement(this.insertSQL);
                try {
                    this.f3680db.beginTransaction();
                    long jSubAppend = subAppend(iLoggingEvent, sQLiteStatementCompileStatement);
                    if (jSubAppend != -1) {
                        secondarySubAppend(iLoggingEvent, jSubAppend);
                        this.f3680db.setTransactionSuccessful();
                    }
                } finally {
                    if (this.f3680db.inTransaction()) {
                        this.f3680db.endTransaction();
                    }
                    sQLiteStatementCompileStatement.close();
                }
            } catch (Throwable th) {
                addError("Cannot append event", th);
            }
        }
    }

    public void finalize() throws Throwable {
        this.f3680db.close();
    }

    public File getDatabaseFile(String str) {
        File file = (str == null || str.trim().length() <= 0) ? null : new File(str);
        return (file == null || file.isDirectory()) ? new File(new AndroidContextUtil().getDatabasePath("logback.db")) : file;
    }

    public String getFilename() {
        return this.filename;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.logCleaner == null) {
            this.logCleaner = new a(this.clock);
        }
        return this.logCleaner;
    }

    public String getMaxHistory() {
        Duration duration = this.maxHistory;
        return duration != null ? duration.toString() : "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    public void setClock(l2.a aVar) {
        this.clock = aVar;
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.dbNameResolver = dBNameResolver;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.logCleaner = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.maxHistory = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z10 = false;
        this.started = false;
        File databaseFile = getDatabaseFile(this.filename);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.f3680db = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            z10 = true;
        } catch (SQLiteException e10) {
            addError("Cannot open database", e10);
        }
        if (z10) {
            if (this.dbNameResolver == null) {
                this.dbNameResolver = new DefaultDBNameResolver();
            }
            this.insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(this.dbNameResolver);
            this.insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(this.dbNameResolver);
            this.insertSQL = SQLBuilder.buildInsertSQL(this.dbNameResolver);
            try {
                this.f3680db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.dbNameResolver));
                this.f3680db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.dbNameResolver));
                this.f3680db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.dbNameResolver));
                clearExpiredLogs(this.f3680db);
                super.start();
                this.started = true;
            } catch (SQLiteException e11) {
                addError("Cannot create database tables", e11);
            }
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f3680db.close();
        this.lastCleanupTime = 0L;
    }
}

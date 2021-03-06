package me.mvp.frame.utils;

import android.os.Environment;
import android.text.TextUtils;

import java.io.File;

import me.mvp.frame.utils.base.BaseUtils;

/**
 * ProjectUtils
 */
public class ProjectUtils extends BaseUtils {

    // 目录名称
    public static String PROJECT_NAME = "MVP";
    // 项目目录
    public static String ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + PROJECT_NAME + File.separator;
    // DB路径
    public static String DB = ROOT_PATH + "db/";
    // 日志路径
    public static String LOG = ROOT_PATH + "log/";
    // 缓存路径
    public static String CACHE = ROOT_PATH + "cache/";
    // 其他路径
    public static String OTHER = ROOT_PATH + "other/";
    // Camera
    public static String CAMERA = ROOT_PATH + "camera/";

    public ProjectUtils() {
        super();
    }

    /**
     * 初始化项目文件夹
     *
     * @return
     */
    public static boolean init() {
        boolean result = true;
        if (DeviceUtils.isExitsSdcard()) {
            result = FileUtils.createOrExistsDir(ROOT_PATH);
            result = FileUtils.createOrExistsDir(DB);
            result = FileUtils.createOrExistsDir(LOG);
            result = FileUtils.createOrExistsDir(CACHE);
            result = FileUtils.createOrExistsDir(OTHER);
            result = FileUtils.createOrExistsDir(CAMERA);
        }
        return result;
    }

    /**
     * 初始化项目文件夹
     *
     * @return
     */
    public static boolean init(String name) {
        PROJECT_NAME = !TextUtils.isEmpty(name) ? name : PROJECT_NAME;
        ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + PROJECT_NAME + File.separator;
        DB = ROOT_PATH + "db/";
        LOG = ROOT_PATH + "log/";
        CACHE = ROOT_PATH + "cache/";
        OTHER = ROOT_PATH + "other/";
        CAMERA = ROOT_PATH + "camera/";
        return init();
    }
}
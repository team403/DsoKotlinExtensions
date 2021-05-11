# DsoKotlinExtension

Dso Kotlin 拓展函数集合

# 使用方法

## Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		// ...
		maven { url 'https://www.jitpack.io' }
	}
}
```
	
## Step 2. Add the dependency

```groovy
dependencies {
	 implementation 'com.github.team403:DsoKotlinExtensions:Tag'
}
```
将 Tag 替换为版本号，如 1.0.0-beta01

# 拓展函数

| ArrayList | |
|:---- | ---- | 
| fun <T> ArrayList<T>.previous(current: T?): T? | 返回 ArrayList 上一项 |    
| fun <T> ArrayList<T>.next(current: T?): T? | 返回 ArrayList 下一项 |

| ByteArray | |
|:---- | ---- | 
| fun ByteArray.toHex(): String? | 字节数组转 16 进制字符串 |  

| Int |  |
|:---- | ---- | 
| fun Int.colorMix(vararg colors: Int): Int | 多颜色混合 |

| List |  |
|:---- | ---- | 
| fun <T> List<T>.toArrayList(): ArrayList<T> | List 转 ArrayList |
| fun <T> List<T>.averageAssignFixLength(splitItemNum: Int): List<List<T>> | List 切割 |

| Long | |
|:---- | ---- | 
| fun Long.toSizeFormat(): String | 转换成大小格式 |
| fun Long.toTimeFormat(): String | 转换成时间格式 |
| fun Long.toDateTimeFormat(): String | 转换成日期时间格式 |
| fun Long.toBitrateFormat(): String | 转成比特率格式 |

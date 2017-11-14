package com.mk.share.order.service.utils;

import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author HEBO
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public final class FileUtil {

	/**
	 * 读取长度
	 */
	public static final int READ_SIZE = 30;

	/**
	 * Constructor
	 */
	private FileUtil() {
	}

	/**
	 * 判断文件类型
	 *
	 * @param inputStream 推回流
	 * @return 文件类型
	 * @throws IOException
	 */
	public static String getType(PushbackInputStream inputStream) throws IOException {

		String fileHead = getFileHead(inputStream);

		if (fileHead == null || fileHead.length() == 0) {
			return fileHead;
		}

		fileHead = fileHead.toUpperCase();
		FileTypeEnum[] fileTypes = FileTypeEnum.values();

		for (FileTypeEnum type : fileTypes) {
			if (fileHead.startsWith(type.getValue().toUpperCase())) {
				return type.name();
			}
		}
		return FileTypeEnum.UNKNOWN.name();
	}

	/**
	 * 将文件头转换成16进制字符串
	 *
	 * @param src 原生byte
	 * @return 16进制字符串
	 */
	private static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder();
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}

	/**
	 * 得到文件头
	 *
	 * @param inputStream 推回流
	 * @return 文件头
	 * @throws IOException
	 */
	private static String getFileHead(PushbackInputStream inputStream) throws IOException {
		if (inputStream == null) {
			return null;
		}
		// read first 30 bytes
		byte[] buffer = new byte[READ_SIZE];
		inputStream.read(buffer, 0, buffer.length);

		// Wind back those 30 bytes
		inputStream.unread(buffer, 0, buffer.length);
		return bytesToHexString(buffer);
	}

	public enum FileTypeEnum {

		/**
		 * JEPG.
		 */
		JPEG("FFD8FF"),

		/**
		 * PNG.
		 */
		PNG("89504E47"),

		/**
		 * GIF.
		 */
		GIF("47494638"),

		/**
		 * TIFF.
		 */
		TIFF("49492A00"),

		/**
		 * Windows Bitmap.
		 */
		BMP("424D"),

		/**
		 * CAD.
		 */
		DWG("41433130"),

		/**
		 * Adobe Photoshop.
		 */
		PSD("38425053"),

		/**
		 * Rich Text Format.
		 */
		RTF("7B5C727466"),

		/**
		 * XML.
		 */
		XML("3C3F786D6C"),

		/**
		 * HTML.
		 */
		HTML("68746D6C3E"),

		/**
		 * Email [thorough only].
		 */
		EML("44656C69766572792D646174653A"),

		/**
		 * Outlook Express.
		 */
		DBX("CFAD12FEC5FD746F"),

		/**
		 * Outlook (pst).
		 */
		PST("2142444E"),

		/**
		 * MS Word/Excel.
		 */
		XLS("D0CF11E0"),

		XLSX("504B030414000600080000002100"),

		/**
		 * CSV.
		 */
		CSV("23D6A7B8B6"),

		/**
		 * MS Access.
		 */
		MDB("5374616E64617264204A"),

		/**
		 * WordPerfect.
		 */
		WPD("FF575043"),

		/**
		 * Postscript.
		 */
		EPS("252150532D41646F6265"),

		/**
		 * Adobe Acrobat.
		 */
		PDF("255044462D312E"),

		/**
		 * Quicken.
		 */
		QDF("AC9EBD8F"),

		/**
		 * Windows Password.
		 */
		PWL("E3828596"),

		/**
		 * ZIP Archive.
		 */
		ZIP("504B0304"),

		/**
		 * RAR Archive.
		 */
		RAR("52617221"),

		/**
		 * Wave.
		 */
		WAV("57415645"),

		/**
		 * AVI.
		 */
		AVI("41564920"),

		/**
		 * Real Audio.
		 */
		RAM("2E7261FD"),

		/**
		 * Real Media.
		 */
		RM("2E524D46"),

		/**
		 * MPEG (mpg).
		 */
		MPG("000001BA"),

		/**
		 * Quicktime.
		 */
		MOV("6D6F6F76"),

		/**
		 * Windows Media.
		 */
		ASF("3026B2758E66CF11"),

		/**
		 * MIDI.
		 */
		MID("4D546864"),

		/**
		 * GZIP
		 */
		GZ("1F8B0800000000000000"),

		/**
		 * 未知类型
		 */
		UNKNOWN("unknown");



		private String value;

		/**
		 * Constructor.
		 *
		 * @param value
		 */
		FileTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}

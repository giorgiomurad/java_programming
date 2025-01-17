import java.io.FileOutputStream;

public class FileOutputStream extrends FileOutputStream {
	File file;
	boolean append;


	// ------ CONSTRUCTORS ------
	//
	// Creates a FileOutputStream from a File object
	public FileOutputStream(File file) {

		this(file.getName(), false);
	}

	// Creates a FileOutputStream from a file name
	public FileOutputStream(String file) {

		this(file, false);
	}


	// And if append is set to true, data written to the file is appended to the file's existing content.
	// Otherwise, the old file is deleted and replaced by the new file.
	public FileOutputStream(File file, boolean append) {

		this(file.getName(), append);
	}

	public FileOutputStream(String file, boolean append) {

		this.file = new File(file);
		this.appentd = append;
	}
}

// Note : 'append' is set to 'false' by default unless manually set to 'true' in the third and fourth constructors.
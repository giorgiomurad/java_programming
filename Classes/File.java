import java.io.File;

// ---- CONSTRUCTORS ----
//
// Creates a file for the specified pathname, the pathname can be a directory or a file
public File(String path) {}

// Creates a file object for the child under the directory parent. The child may be a filename or subdriectory
public File(String parent, String child) {}

// Creates a file object under the directory parent. The parent is a file object while the child may be a filename
// or subdirectory
public File(File parent, String child) {}


// ---- METHODS ----
//
// Returns true if the file or the directory exists
public boolean exists() {}

// Returns true if the file exists, and is readable
public boolean canRead() {}

// Returns true if the file exists, and is editable
public boolean canWrite() {}

// Returns true if the file object represents a directory
public boolean isDirectory() {}

// Returns true if the file object represents a file
public boolean isFile() {}

// Returns true if the file object was created using an absolute path
public boolean isAbsolute() {}

// Returns true if the file is hidden, false otherwise
public boolean isHidden() {}

// Returns the complete absolute file or directory name represented by the file object
public String getAbsolutePath() {}

// Returns the same as getAbsolutePath() except that it removes redundant names,
// such as "." and "..", from the path name.
public String getCanonicalPath() {}

// Returns the name of the file
public String getName() {}

// Returns the complete path of the file without the filename
public String getPath() {}

// Returns the name of the parent file
public String getParent() {}

// Returns the time the file was last modified
public long lastMadified() {}

// Returns the size of the file, zero if the file does not exist, or is a directory
public long length() {}

// If the file represents a directory,
// an array of file objects is returned where each file element references one child file or subdirectory
public File[] listFile() {}

// Deletes the file, and returns true if the deletion was successful
public boolean delete() {}

// Renames the file, and returns true if the operation was a success
public boolean rename(File dist) {}
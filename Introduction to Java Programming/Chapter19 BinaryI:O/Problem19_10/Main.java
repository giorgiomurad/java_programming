// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Binary I/O
//
// Problem 19.10 : Suppose a program splits a large file into smaller files, and backs up these
//                 files separately.
//                 Write a program that runs from the command prompt, and takes two inputs.
//                 The first input is the name of the source file, and the second is how many
//                 files the large file should split into.
//
//
// Author : Giorgio Murad
import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String sourceFile;  // Name of the source file
        int nbOfFiles;      // Number of files


        // Initializing variables
        sourceFile = args[0];
        nbOfFiles  = Integer.parseInt(args[1]);

        // Creating a file object that directs to the file
        File file = new File(sourceFile);

        // Creating an input stream to read from the source file
        DataInputStream inputStream = new DataInputStream(new FileInputStream(file));

        // Storing data from the file into the array list
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            while (true) {
                String temp;    // Temporary String

                temp = inputStream.readUTF();
                arrayList.add(temp);
            }
        } catch (IOException ig) {}

        // Retrieving the size of the array list, and the split size
        long sourceSize = arrayList.size();
        long splitSize  = sourceSize / nbOfFiles;

        // Dividing the large array list into smaller array lists based on the number of files
        ArrayList<String>[] minorLists = new ArrayList[nbOfFiles];
        for (int i = 0; i < nbOfFiles; i++) {
            minorLists[i] = new ArrayList<String>();

            for (int j = 0; j < splitSize; j++)
                minorLists[i].add(arrayList.remove(0));
        }

        // In case the initial arrayList stills contains data, these data are added to the last file
        while (!arrayList.isEmpty()) {
            String temp = arrayList.remove(0);

            minorLists[nbOfFiles-1].add(temp);
        }


        // Creating an output stream that divides the large file into smaller files
        DataOutputStream outputStream;
        for (int i = 1; i <= nbOfFiles; i++) {
            String fileName = String.format("%s_%d.dat", file.getName().replace(".dat", ""), i);
            outputStream = new DataOutputStream(new FileOutputStream(fileName));

            ArrayList<String> str = minorLists[i-1];
            while (!str.isEmpty()) {
                String temp = str.remove(0);

                outputStream.writeUTF(temp);
            }

            outputStream.close();
        }
    }
}
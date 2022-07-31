// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.35 : Biologists use a sequence of letters A, C, T, and G to sequence a genome.
//                A gene is a substring of the genome that starts after the triplet ATG, and
//                ends before a triplet TAG, TAA, or TGA.
//                Furthermore, the length of a gene is a multiple of three, and cannot be ATG,
//                TAG, TAA, nor TGA.
//                Write a program that prompts the user to input a genome, and displays all the
//                genes inside that genome. If the genome does not contain any gene, the program
//                should display so.
//                Sample Input: TTATGTTTTAGAGGATGGGGCGTTAGTT
//
//
// Author : Giorgio Murad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genome;


        // Prompting the user to input a genome
        System.out.print("Enter the genome: ");
        genome = input.next();

        // Displaying Result
        printGenes(genome);
    }

    // Method that prints the genes of the genome
    public static void printGenes(String genome) {
        String trimmed;         // Trimmed Genome
        String gene;            // Gene
        int begin, end;         // Begin and End Index
        int end1, end2, end3;   // End Instances
        int count = 0;          // Number of genes obtained


        // Trimming the genome, and printing its genes
        trimmed = trimGenome(genome);
        while (!trimmed.isEmpty()) {
            // Determining the index
            begin = trimmed.indexOf("ATG") + 3;


            // Getting the end instances
            end1 = trimmed.indexOf("TAG");
            if (end1 < 0)
                end1 = trimmed.length();

            end2 = trimmed.indexOf("TAA");
            if (end2 < 0)
                end2 = trimmed.length();

            end3 = trimmed.indexOf("TGA");
            if (end3 < 0)
                end3 = trimmed.length();


            // Determining the end index
            end = Math.min(end1, end2);
            end = Math.min(end3, end);

            // If the length of the gene is a multiple of three, it is printed
            gene = trimmed.substring(begin, end);
            if (gene.length() % 3 == 0) {
                count++;

                System.out.println(gene);
            }

            // Reducing the genome
            trimmed = trimmed.substring(end+3);
        }

        // If no gene was found, displaying message
        if (count == 0)
            System.out.println("The genome does not have any gene.");
    }

    // Method that trims the genome on both sides where the genome would starts with "ATG",
    // and ends with "TGA", "TAA", or "TGA"
    public static String trimGenome(String genome) {
        int begin;  // Begin Index
        int end;    // End Index


        // Three end indexes to choose between
        int end1 = genome.lastIndexOf("TAG");
        int end2 = genome.lastIndexOf("TAA");
        int end3 = genome.lastIndexOf("TGA");

        // Determining the 'begin' and 'end' indexes
        begin = genome.indexOf("ATG");
        end   = Math.max(end1, end2);
        end   = Math.max(end, end3) + 3;

        // Returning the trimmed genome
        return genome.substring(begin, end);
    }
}
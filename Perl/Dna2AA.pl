#!/usr/bin/perl
# Author: J.R. Villari

# This program converts a fasta file containing a DNA sequence into its
# respective amino acid sequence, and prints the results.

use strict;
use warnings;

print "Please enter a FASTA filename:\n";
my $filename = <STDIN>;

open(FILE, $filename) || die("Couldn't read file $filename\n");
<FILE>;
my @line = <FILE>;
chomp(@line);
my $string = join("",@line);

my $codon;
my $lengthOfsequence = length $string;

print "\n";
print "Amino Acid Sequence:\n";

for (my $i=0; $i <= ($lengthOfsequence-3);$i+=3)
{
    $codon = substr($string, $i, 3);
    
    if ($codon eq "GCT" || $codon eq "GCC" || $codon eq "GCA" || $codon eq "GCG" || $codon eq "GCU")
    {
        print "A";
    }
    elsif ($codon eq "CGT" || $codon eq "CGC" || $codon eq "CGA" || $codon eq "CGG" || $codon eq "AGA" || $codon eq "AGG" || $codon eq "CGU")
    {
        print "R";
    }
    elsif ($codon eq "AAT" || $codon eq "AAC" || $codon eq "AAU")
    {
        print "N";
    }
    elsif ($codon eq "GAT" || $codon eq "GAC" || $codon eq "GAU")
    {
        print "D";
    }
    elsif ($codon eq "TGT" || $codon eq "TGC" || $codon eq "UGU" || $codon eq "UGC")
    {
        print "C";
    }
    elsif ($codon eq "CAA" || $codon eq "CAG")
    {
        print "Q";
    }
    elsif ($codon eq "GAA" || $codon eq "GAG")
    {
        print "E";
    }
    elsif ($codon eq "GGT" || $codon eq "GGC" || $codon eq "GGA" || $codon eq "GGG" || $codon eq "GGU")
    {
        print "G";
    }
    elsif ($codon eq "CAT" || $codon eq "CAC" || $codon eq "CAU")
    {
        print "H";
    }
    elsif ($codon eq "ATT" || $codon eq "ATC" || $codon eq "ATA" || $codon eq "AUU" || $codon eq "AUC" || $codon eq "AUA")
    {
        print "I";
    }
    elsif ($codon eq "TTA" || $codon eq "TTG" || $codon eq "CTT" || $codon eq "CTC" || $codon eq "CTA" || $codon eq "CTG" || $codon eq "UUA" || $codon eq "UUG" || $codon eq "CUU" || $codon eq "CUC" || $codon eq "CUA" || $codon eq "CUG")
    {
        print "L";
    }
    elsif ($codon eq "AAA" || $codon eq "AAG")
    {
        print "K";
    }
    elsif ($codon eq "ATG" || $codon eq "AUG")
    {
        print "M";
    }
    elsif ($codon eq "TTT" || $codon eq "TTC" || $codon eq "UUU" || $codon eq "UUC")
    {
        print "F";
    }
    elsif ($codon eq "CCT" || $codon eq "CCC" || $codon eq "CCA" || $codon eq "CCG" || $codon eq "CCU")
    {
        print "P";
    }
    elsif ($codon eq "TCT" || $codon eq "TCC" || $codon eq "TCA" || $codon eq "TCG" || $codon eq "AGT" || $codon eq "AGC" || $codon eq "UCU" || $codon eq "UCC" || $codon eq "UCA" || $codon eq "UCG" || $codon eq "AGU")
    {
        print "S";
    }
    elsif ($codon eq "ACT" || $codon eq "ACC" || $codon eq "ACA" || $codon eq "ACG" || $codon eq "AUT")
    {
        print "T";
    }
    elsif ($codon eq "TGG" || $codon eq "UGG")
    {
        print "W";
    }
    elsif ($codon eq "TAT" || $codon eq "TAC" || $codon eq "UAU" || $codon eq "UAC")
    {
        print "Y";
    }
    elsif ($codon eq "GTT" || $codon eq "GTC" || $codon eq "GTA" || $codon eq "GTG" || $codon eq "GUU" || $codon eq "GUC" || $codon eq "GUA" || $codon eq "GUG")
    {
        print "V";
    }
    elsif ($codon eq "TAA" || $codon eq "TGA" || $codon eq "TAG" || $codon eq "UAA" || $codon eq "UGA" || $codon eq "UAG")
    {
        print "{STOP}";
    }
    else
    {
        print "***ERROR***";
    }
}

#!/usr/bin/perl
# Author: J.R. Villari

# This program counts the frequency of every k-mer (of a specified size)
# and prints the count and frequency. It takes a FASTA file as input.

use strict;
use warnings;

print "Please enter a FASTA filename:\n";
my $filename = <STDIN>;

open(FILE, $filename) || die("Couldn't read file $filename\n");
<FILE>;
my @line = <FILE>;
chomp(@line);
my $string = join("",@line);

my $lengthOfsequence = length $string;

my %fivemerHash;
my $doNothing = 0; 
my $frequency = 0;

for (my $i=0; $i <= ($lengthOfsequence-5); $i++)
  {
    my $fivemer = substr($string, $i, 5);
    if (exists($fivemerHash{$fivemer}))
      {
	$doNothing = 0;
      }
    else{
      $frequency = 0;
      for (my $j=0; $j<= ($lengthOfsequence-5); $j++)
      {
	my $otherFivemer = substr($string, $j, 5);
	if ($fivemer eq $otherFivemer)
	{ 
	  $frequency++;
	}
      }
      $fivemerHash{$fivemer} = $frequency;}
    
  }
print "\n";
print "     ALL 5-MERS FOUND   \n";
print "5-mer: $_     Count: $fivemerHash{$_}\n" foreach (keys%fivemerHash);

my @unique = grep { $fivemerHash{$_} == 1 } keys %fivemerHash;
print "\n";
print "Distinct 5-mers Found: @unique \n";
print "\n";

close FILE;  

exit;

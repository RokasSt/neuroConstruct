'''
******************************************************

     File generated by: neuroConstruct v1.2.3
 
******************************************************
'''

f = open("my_simulator", mode='r')

my_simulator = f.read()
exec("from pyNN.%s import *" % my_simulator)
f.close()

synapse_dynamics = None

gmax = 5E-7

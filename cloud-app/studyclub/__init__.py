#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Jun  8 00:35:49 2021

@author: kakatuahitam
"""

from flask import Flask
app = Flask(__name__)

import studyclub.apiroutes
import studyclub.views
